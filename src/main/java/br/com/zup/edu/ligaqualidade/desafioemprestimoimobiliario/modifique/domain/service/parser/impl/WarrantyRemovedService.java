package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants.WarrantyOffsets;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class WarrantyRemovedService implements MessageParserService<Warranty> {

  @Override
  public Warranty parseMessage(Event event, List<String> message) {
    Warranty warranty = new Warranty();
    warranty.setId(message.get(WarrantyOffsets.WARRANTY_ID));
    warranty.setProposalId(message.get(WarrantyOffsets.PROPOSAL_ID));
    return warranty;
  }
}
