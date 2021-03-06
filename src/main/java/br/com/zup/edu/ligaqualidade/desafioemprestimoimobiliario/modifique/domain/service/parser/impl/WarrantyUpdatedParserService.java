package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class WarrantyUpdatedParserService implements MessageParserService<Warranty> {

  private final MessageParserService<Warranty> messageParserService = new WarrantyAddedParserService();
  @Override
  public Warranty parseMessage(Event event, List<String> message) {

    return messageParserService.parseMessage(event, message);
  }
}
