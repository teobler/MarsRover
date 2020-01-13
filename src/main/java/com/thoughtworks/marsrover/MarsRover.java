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
                int indexOfDirection = Arrays.asList(Direction.values()).indexOf(this.direction);
                this.direction = Direction.values()[(indexOfDirection + 1) % 4];
              }

              if ('L' == command) {
                int indexOfDirection = Arrays.asList(Direction.values()).indexOf(this.direction);
                this.direction = Direction.values()[(indexOfDirection + 3) % 4];
              }
            });
  }

  public Position getPosition() {
    return position;
  }

  public Direction getDirection() {
    return direction;
  }

  private void move() {
    if (this.direction.equals(Direction.N)) {
      this.position = new Position(this.position.getPositionX(), this.position.getPositionY() + 1);
    }

    if (this.direction.equals(Direction.E)) {
      this.position = new Position(this.position.getPositionX() + 1, this.position.getPositionY());
    }

    if (this.direction.equals(Direction.S)) {
      this.position = new Position(this.position.getPositionX(), this.position.getPositionY() - 1);
    }

    if (this.direction.equals(Direction.W)) {
      this.position = new Position(this.position.getPositionX() - 1, this.position.getPositionY());
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
