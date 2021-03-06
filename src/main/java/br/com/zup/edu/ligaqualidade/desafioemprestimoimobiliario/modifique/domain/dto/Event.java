package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto;

import java.util.Optional;

public class Event {
  private String id;
  private String schema;
  private String action;
  private String timestamp;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public String getUpperSchemaConcatActionByUnderscore() {

    String schema = Optional.of(this.schema).orElse("");
    String action = Optional.of(this.action).orElse("");

    return schema.toUpperCase() + "_" + action.toUpperCase();
  }
}
