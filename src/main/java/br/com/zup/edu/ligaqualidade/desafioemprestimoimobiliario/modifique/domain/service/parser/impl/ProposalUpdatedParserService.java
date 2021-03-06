package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class ProposalUpdatedParserService implements MessageParserService<Proposal> {

  private final MessageParserService<Proposal> proposalCreatedParserService = new ProposalCreatedParserService();
  @Override
  public Proposal parseMessage(Event event, List<String> message) {
    return proposalCreatedParserService.parseMessage(event, message);
  }
}
