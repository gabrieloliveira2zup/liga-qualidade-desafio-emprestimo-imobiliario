package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.factory;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.Event;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.MessageParserService;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl.ProposalCreatedParserService;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.impl.ProposalUpdatedParserService;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MessageParseFactory {
  static Map<String, MessageParserService> messageParseServiceMap = new HashMap<>();

  static {
    messageParseServiceMap.put("PROPOSAL_CREATED", new ProposalCreatedParserService());
    messageParseServiceMap.put("PROPOSAL_UPDATED", new ProposalUpdatedParserService());
    messageParseServiceMap.put("PROPOSAL_REMOVED", new ProposalUpdatedParserService());
    messageParseServiceMap.put("PROPOSAL_REMOVED", new ProposalUpdatedParserService());
    messageParseServiceMap.put("PROPOSAL_REMOVED", new ProposalUpdatedParserService());
    messageParseServiceMap.put("PROPOSAL_REMOVED", new ProposalUpdatedParserService());
    // more operators
  }

  public static MessageParserService getParseService(Event event) {
    return messageParseServiceMap.get(event.getUpperSchemaConcatActionByUnderscore());
  }
}
