package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto;

import java.math.BigDecimal;

public class Proposal{
  private String id;
  private BigDecimal loanValue;
  private Integer numberOfMonthlyInstallments;
  private Event event;

  public Event getEvent() {
    return event;
  }

  public void setEvent(
      Event event) {
    this.event = event;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setLoanValue(String loanValue) {
    this.loanValue = new BigDecimal(loanValue);
  }

  public void setNumberOfMonthlyInstallments(String numberOfMonthlyInstallments) {
    this.numberOfMonthlyInstallments = Integer.valueOf(numberOfMonthlyInstallments);
  }

  public String getId() {
    return id;
  }

  public BigDecimal getLoanValue() {
    return loanValue;
  }

  public Integer getNumberOfMonthlyInstallments() {
    return numberOfMonthlyInstallments;
  }
}
