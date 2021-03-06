package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.domain.constants;

public class MessageOffsetConstants {

  public static final class EventOffsets{
    public static final Integer EVENT_ID = 0;
    public static final Integer SCHEMA = 1;
    public static final Integer ACTION = 2;
    public static final Integer TIMESTAMP = 3;
  }
  public static final class ProposalOffsets{
    public static final Integer PROPOSAL_ID = 4;
    public static final Integer LOAN_VALUE = 5;
    public static final Integer NUMBER_OF_MONTHLY_INSTALLMENTS = 6;
    private ProposalOffsets(){}
  }

  public static final class WarrantyOffsets{
    public static final Integer PROPOSAL_ID = 4;
    public static final Integer WARRANTY_ID = 5;
    public static final Integer VALUE = 6;
    public static final Integer PROVINCE = 7;
    private WarrantyOffsets(){}
  }

  public static final class ProponentOffsets{
    public static final Integer PROPOSAL_ID = 4;
    public static final Integer PROPONENT_ID = 5;
    public static final Integer NAME = 6;
    public static final Integer AGE = 7;
    public static final Integer MONTHLY_INCOME = 8;
    public static final Integer IS_MAIN = 9;
    private ProponentOffsets(){}
  }

  private MessageOffsetConstants(){}
}
