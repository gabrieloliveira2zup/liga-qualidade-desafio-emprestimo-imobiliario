package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants.ProposalOffsets;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class ProposalRemovedParserService implements MessageParserService<Proposal> {

  @Override
  public Proposal parseMessage(Event event, List<String> message) {
    Proposal proposal = new Proposal();
    proposal.setEvent(event);
    proposal.setId(message.get(ProposalOffsets.PROPOSAL_ID));
    return proposal;
  }
}
