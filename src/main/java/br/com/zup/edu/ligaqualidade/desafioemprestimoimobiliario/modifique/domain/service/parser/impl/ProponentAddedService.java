package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants.MessageOffsetConstants.ProponentOffsets;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Proponent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Warranty;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import java.util.List;

public class ProponentAddedService implements MessageParserService<Proponent> {

  @Override
  public Proponent parseMessage(Event event, List<String> message) {
    Proponent proponent = new Proponent();
    proponent.setEvent(event);
    proponent.setId(message.get(ProponentOffsets.PROPONENT_ID));
    proponent.setAge(message.get(ProponentOffsets.AGE));
    proponent.setIsMain(message.get(ProponentOffsets.IS_MAIN));
    proponent.setMonthlyIncome(message.get(ProponentOffsets.MONTHLY_INCOME));
    proponent.setName(message.get(ProponentOffsets.NAME));
    proponent.setProposalId(message.get(ProponentOffsets.PROPOSAL_ID));

    return proponent;
  }
}
