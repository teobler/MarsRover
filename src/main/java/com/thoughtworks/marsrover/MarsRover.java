package com.thoughtworks.marsrover;

public class MarsRover {
  private Position position;
  private Direction direction;

  public MarsRover(int positionX, int positionY, Direction direction) {
    this.position = new Position(positionX, positionY);
    this.direction = direction;
  }

  public static MarsRover init(int positionX, int positionY, Direction direction) {
    return new MarsRover(positionX, positionY, direction);
  }

  public Position getPosition() {
    return position;
  }

  public Direction getDirection() {
    return direction;
  }
}

enum Direction {
  N, E, S, W
}

class Position {
  private int positionX;
  private int positionY;

  public Position(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
  }

  public int getPositionX() {
    return positionX;
  }

  public int getPositionY() {
    return positionY;
  }
}
