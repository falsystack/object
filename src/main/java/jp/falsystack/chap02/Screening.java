package jp.falsystack.chap02;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Screening {

  private int sequence;
  private Movie movie;
  private LocalDateTime whenScreened;

  public boolean isSequence(int sequence) {
    return this.sequence == sequence;
  }

  public Money getMovieFee() {
    return movie.getFee();
  }

  public LocalDateTime getStartTime() {
    return whenScreened;
  }

}
