package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.handler.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.EventHelper;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Proponent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.factory.MessageParseFactory;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.Arrays;
import java.util.List;

public class ParserHandlerService{

    public EventHelper parseMessages(List<String> messages){
        EventHelper eventHelper = new EventHelper();

        messages.forEach(message ->{
            List<String> splitedMessage = splitMessageByComma(message);
            Event event = MessageParserService.createEvent(splitedMessage);
            MessageParserService messageParserService = MessageParseFactory.getParseService(event);
            Object parsedEvent = parseEventToObject(messageParserService, event, splitedMessage);
            addParsedEventToHelper(eventHelper, parsedEvent);
        });

        return eventHelper;
    }

    private List<String> splitMessageByComma(String message){
        return Arrays.asList(message.split("\\s*,\\s*"));
    }

    private Object parseEventToObject(MessageParserService messageParserService, Event event, List<String> splitedMessage){
        return messageParserService.parseMessage(event, splitedMessage);
    }

    private void addParsedEventToHelper(EventHelper eventHelper, Object parsedEvent){
        if(parsedEvent instanceof Proponent){
            eventHelper.proponentSet.add((Proponent) parsedEvent);
        }else if(parsedEvent instanceof Proposal){
            eventHelper.proposalSet.add((Proposal) parsedEvent);
        }else if(parsedEvent instanceof Warranty){
            eventHelper.warrantySet.add((Warranty) parsedEvent);
        }
    }
}
