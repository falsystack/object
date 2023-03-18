package jp.falsystack.chap01;

import lombok.AccessLevel;
import lombok.Setter;

public class Bag {

  private Long amount;
  private final Invitation invitation;
  @Setter(AccessLevel.PRIVATE)
  private Ticket ticket;

  public Bag(Long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, Long amount) {
    this.invitation = invitation;
    this.amount = amount;
  }

  private boolean hasInvitation() {
    return invitation != null;
  }


  private void minusAmount(Long amount) {
    this.amount -= amount;
  }


  public Long hold(Ticket ticket) {
    if (hasInvitation()) {
      setTicket(ticket);
      return 0L;
    }
    minusAmount(ticket.getFee());
    setTicket(ticket);
    return ticket.getFee();
  }
}
