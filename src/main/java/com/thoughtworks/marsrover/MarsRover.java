package com.thoughtworks.marsrover;

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

  public void execute(String command) {
    if ("M".equals(command)) {
      move();
    }
  }

  public Position getPosition() {
    return position;
  }

  public Direction getDirection() {
    return direction;
  }

  private void move() {
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

    if (this.direction.equals(Direction.W)) {
      this.position =
          new Position(this.position.getPositionX() -1 , this.position.getPositionY());
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
