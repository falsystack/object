package jp.falsystack;

import lombok.Getter;

public class Audience {

  private final Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }


  public Long buy(Ticket ticket) {
    if (bag.hasInvitation()) {
      bag.setTicket(ticket);
      return 0L;
    }
    bag.minusAmount(ticket.getFee());
    bag.setTicket(ticket);
    return ticket.getFee();
  }

}
