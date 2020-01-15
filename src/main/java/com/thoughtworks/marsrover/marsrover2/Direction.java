package com.thoughtworks.marsrover.marsrover2;

import java.util.Arrays;

enum Direction {
  N(0),
  E(1),
  S(2),
  W(3);

  private int code;

  Direction(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
