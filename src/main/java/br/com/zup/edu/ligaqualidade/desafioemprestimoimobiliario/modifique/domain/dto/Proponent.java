package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.dto;

import java.math.BigDecimal;

public class Proponent {
  private String id;
  private String proposalId;
  private String name;
  private Integer age;
  private BigDecimal monthlyIncome;
  private Boolean isMain;
  private Event event;

  public Event getEvent() {
    return event;
  }

  public void setEvent(
      Event event) {
    this.event = event;
  }

  public void setAge(String age) {
    this.age = Integer.parseInt(age);
  }

  public void setMonthlyIncome(String monthlyIncome) {
    this.monthlyIncome = new BigDecimal(monthlyIncome);
  }

  public void setIsMain(String isMain) {
    this.isMain = Boolean.getBoolean(isMain);
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public BigDecimal getMonthlyIncome() {
    return monthlyIncome;
  }

  public Boolean getIsMain() {
    return isMain;
  }
}
