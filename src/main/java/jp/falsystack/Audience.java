package jp.falsystack;

import lombok.Getter;

public class Audience {

  @Getter
  private final Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }


}
