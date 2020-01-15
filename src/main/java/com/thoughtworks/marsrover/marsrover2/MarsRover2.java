package com.thoughtworks.marsrover.marsrover2;

import lombok.Getter;

@Getter
public class MarsRover2 {
  private Position position;

  public MarsRover2(int X, int Y, Direction direction) {
    this.position =
        Position.builder()
            .direction(direction)
            .coordinates(Coordinates.builder().X(X).Y(Y).build())
            .build();
  }

  public static MarsRover2 init(int positionX, int positionY, Direction direction) {
    return new MarsRover2(positionX, positionY, direction);
  }

  public void execute(String command) {
    if ("M".equals(command)) {
      this.position = Commands.MOVING_COMMANDS
          .get(this.position.getDirection())
          .apply(this.position);
    }
  }
}
