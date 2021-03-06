package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants.WarrantyOffsets;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class WarrantyAddedParserService implements MessageParserService<Warranty> {

  private final MessageParserService<Warranty> warrantyMessageParserService = new WarrantyRemovedService();
  @Override
  public Warranty parseMessage(Event event, List<String> message) {
    Warranty warranty = warrantyMessageParserService.parseMessage(event,message);
    warranty.setProvince(message.get(WarrantyOffsets.PROVINCE));
    warranty.setValue(message.get(WarrantyOffsets.VALUE));

    return warranty;
  }
}
