package com.thoughtworks.marsrover;

import java.util.Arrays;

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

  public void execute(String commands) {
    commands
        .chars()
        .mapToObj(c -> (char) c)
        .forEach(
            command -> {
              if ('M' == command) {
                move();
              }

              if ('R' == command) {
                turnRight();
              }

              if ('L' == command) {
                turnLeft();
              }
            });
  }

  public Position getPosition() {
    return position;
  }

  public Direction getDirection() {
    return direction;
  }

  private void turnRight() {
    int indexOfDirection = Arrays.asList(Direction.values()).indexOf(this.direction);
    int lengthOfDirection = Direction.values().length;
    this.direction = Direction.values()[(indexOfDirection + 1) % lengthOfDirection];
  }

  private void turnLeft() {
    int indexOfDirection = Arrays.asList(Direction.values()).indexOf(this.direction);
    int lengthOfDirection = Direction.values().length;
    this.direction =
        Direction.values()[(indexOfDirection + (lengthOfDirection - 1)) % lengthOfDirection];
  }

  private void move() {
    if (this.direction.equals(Direction.N)) {
      this.position = this.position.plusY();
    }

    if (this.direction.equals(Direction.E)) {
      this.position = this.position.plusX();
    }

    if (this.direction.equals(Direction.S)) {
      this.position = this.position.minusY();
    }

    if (this.direction.equals(Direction.W)) {
      this.position = this.position.minusX();
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

  public Position plusX() {
    return new Position(positionX + 1, positionY);
  }

  public Position plusY() {
    return new Position(positionX, positionY + 1);
  }

  public Position minusX() {
    return new Position(positionX - 1, positionY);
  }

  public Position minusY() {
    return new Position(positionX, positionY - 1);
  }

  public int getPositionX() {
    return positionX;
  }

  public int getPositionY() {
    return positionY;
  }
}
