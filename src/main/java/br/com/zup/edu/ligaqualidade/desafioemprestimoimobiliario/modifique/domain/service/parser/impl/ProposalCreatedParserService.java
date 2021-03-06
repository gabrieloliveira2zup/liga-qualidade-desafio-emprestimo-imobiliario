package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants.ProposalOffsets;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Proposal;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class ProposalCreatedParserService implements MessageParserService<Proposal> {

  private final MessageParserService<Proposal> proposalMessageParserService = new ProposalRemovedParserService();
  @Override
  public Proposal parseMessage(Event event, List<String> message) {
    Proposal proposal = proposalMessageParserService.parseMessage(event,message);
    proposal.setLoanValue(message.get(ProposalOffsets.LOAN_VALUE));
    proposal.setNumberOfMonthlyInstallments(message.get(ProposalOffsets.NUMBER_OF_MONTHLY_INSTALLMENTS));

    return proposal;
  }
}
