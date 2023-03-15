package jp.falsystack;

import lombok.Getter;

public class TicketSeller {

  @Getter
  private final TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }


}
