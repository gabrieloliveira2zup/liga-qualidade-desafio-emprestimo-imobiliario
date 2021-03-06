package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto.EventHelper;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.service.parser.handler.impl.ParserHandlerService;
import java.util.List;
import java.util.Map;

public class Solucao {
	
  public static String processMessages(List<String> messages) {
    ParserHandlerService parserHandlerService = new ParserHandlerService();
    EventHelper eventHelper = parserHandlerService.parseMessages(messages);

	  return ""; 
  }
}
