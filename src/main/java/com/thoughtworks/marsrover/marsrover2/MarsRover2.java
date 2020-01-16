package com.thoughtworks.marsrover.marsrover2;

import lombok.Getter;

@Getter
public class MarsRover2 {
  private Position position;
  private Gearbox gearbox;
  private Radar radar;

  public MarsRover2(int X, int Y, Direction direction, Gearbox gearbox, Radar radar) {
    this.position =
        Position.builder()
            .direction(direction)
            .coordinates(Coordinates.builder().X(X).Y(Y).build())
            .build();
    this.gearbox = gearbox;
    this.radar = radar;
  }

  public static MarsRover2 init(int positionX, int positionY, Direction direction, Gearbox gearbox, Radar radar) {
    return new MarsRover2(positionX, positionY, direction, gearbox, radar);
  }

  public MarsRover2 execute(String commands) {
    MarsRover2 newMarsRover = null;

    for (int i = 0; i < commands.length(); i++) {
      String command = commands.substring(i, i + 1);

      if ("M".equals(command)) {
        this.position =
            Commands.MOVING_COMMANDS
                .get(this.gearbox)
                .get(this.position.getDirection())
                .apply(this.position);

        if (radar.scanIfInPit()) {
          newMarsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar());
          break;
        }
      }

      if (Commands.CHANGING_GEARBOX_COMMANDS.containsKey(command)) {
        this.gearbox = Commands.CHANGING_GEARBOX_COMMANDS.get(command);
      }

      if ("L".equals(command) || "R".equals(command)) {
        this.position = Commands.TURNING_COMMANDS
            .get(this.gearbox)
            .get(command)
            .apply(this.position);
      }
    }

    return newMarsRover;
  }
}
