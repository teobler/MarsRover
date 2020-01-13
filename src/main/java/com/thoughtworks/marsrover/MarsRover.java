package com.thoughtworks.marsrover;

enum Commands {
  M
}

enum Direction {
  N,
  E,
  S,
  W
}

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

  public void execute(String command) {
    if ("M".equals(command)) {
      if (this.direction.equals(Direction.N)) {
        this.position =
            new Position(this.position.getPositionX(), this.position.getPositionY() + 1);
      }

      if (this.direction.equals(Direction.E)) {
        this.position =
            new Position(this.position.getPositionX() + 1, this.position.getPositionY());
      }

      if (this.direction.equals(Direction.S)) {
        this.position =
            new Position(this.position.getPositionX(), this.position.getPositionY() - 1);
      }
    }
  }
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
