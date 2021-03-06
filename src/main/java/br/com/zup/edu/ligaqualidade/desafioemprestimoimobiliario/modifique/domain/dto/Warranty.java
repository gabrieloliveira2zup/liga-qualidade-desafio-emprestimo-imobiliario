package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto;

import java.math.BigDecimal;

public class Warranty{
  private String id;
  private String proposalId;
  private BigDecimal value;
  private String province;
  private Event event;

  public Event getEvent() {
    return event;
  }

  public void setEvent(
      Event event) {
    this.event = event;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProposalId() {
    return proposalId;
  }

  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = new BigDecimal(value);
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
}
