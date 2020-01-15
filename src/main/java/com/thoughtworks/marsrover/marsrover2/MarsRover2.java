package com.thoughtworks.marsrover.marsrover2;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class MarsRover2 {
  private Position position;
  private Gearbox gearbox;

  public MarsRover2(int X, int Y, Direction direction, Gearbox gearbox) {
    this.position =
        Position.builder()
            .direction(direction)
            .coordinates(Coordinates.builder().X(X).Y(Y).build())
            .build();
    this.gearbox = gearbox;
  }

  public static MarsRover2 init(int positionX, int positionY, Direction direction, Gearbox gearbox) {
    return new MarsRover2(positionX, positionY, direction, gearbox);
  }

  public void execute(String commands) {
    Arrays.stream(commands.split(""))
        .forEach(
            command -> {
              if ("M".equals(command)) {
                this.position =
                    Commands.MOVING_COMMANDS.get(this.position.getDirection()).apply(this.position);
              }

              if ("B".equals(command)) {
                this.gearbox = Gearbox.R;
              }

              if ("L".equals(command) || "R".equals(command)) {
                this.position = Commands.TURNING_COMMANDS.get(command).apply(this.position);
              }
            });
  }
}
