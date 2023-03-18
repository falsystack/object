package jp.falsystack.chap01;

public class Theater {

  // Theaterはただ？ひたすら？TicketSellerのインタフェースだけを依存する
  private final TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
    ticketSeller.sellTo(audience);
  }

}

