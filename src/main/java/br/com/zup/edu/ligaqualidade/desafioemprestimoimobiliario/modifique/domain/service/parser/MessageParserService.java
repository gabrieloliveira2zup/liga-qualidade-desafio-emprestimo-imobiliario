package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants.EventOffsets;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import java.util.List;

public interface MessageParserService<T> {
  T parseMessage(Event event, List<String> message);

  static Event createEvent(List<String> message){
    Event event = new Event();
    event.setId(message.get(EventOffsets.EVENT_ID));
    event.setSchema(message.get(EventOffsets.SCHEMA));
    event.setAction(message.get(EventOffsets.ACTION));
    event.setTimestamp(message.get(EventOffsets.TIMESTAMP));
    return  event;
  }

}
