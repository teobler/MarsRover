package com.thoughtworks.marsrover.marsover3;

import lombok.Getter;

@Getter
public class MarsRover3 {
  private Position position;
  private Direction direction;

  public MarsRover3(int X, int Y, Direction direction) {
    this.position = new Position(X, Y);
    this.direction = direction;
  }

  public static MarsRover3 init(int X, int Y, Direction direction) {
    return new MarsRover3(X, Y, direction);
  }
}
