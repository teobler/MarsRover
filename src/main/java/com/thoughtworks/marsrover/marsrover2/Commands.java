package com.thoughtworks.marsrover.marsrover2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Commands {
  static Function<Position, Position> addX =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX() + 1)
                      .Y(position.getCoordinates().getY())
                      .build())
              .build();

  static Function<Position, Position> addY =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX())
                      .Y(position.getCoordinates().getY() + 1)
                      .build())
              .build();

  static Function<Position, Position> subX =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX() - 1)
                      .Y(position.getCoordinates().getY())
                      .build())
              .build();

  static Function<Position, Position> subY =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX())
                      .Y(position.getCoordinates().getY() - 1)
                      .build())
              .build();

  static Function<Position, Position> turnLeft =
      position ->
          Position.builder()
              .direction(Direction.valueOf((position.getDirection().getCode() + 3) % 4))
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX())
                      .Y(position.getCoordinates().getY())
                      .build())
              .build();

  static Function<Position, Position> turnRight =
      position ->
          Position.builder()
              .direction(Direction.valueOf((position.getDirection().getCode() + 1) % 4))
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX())
                      .Y(position.getCoordinates().getY())
                      .build())
              .build();

  public static final Map<Direction, Function<Position, Position>> MOVING_FORWARD_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<Direction, Function<Position, Position>>() {
            {
              put(Direction.N, addY);
              put(Direction.W, subX);
              put(Direction.S, subY);
              put(Direction.E, addX);
            }
          });

  public static final Map<Direction, Function<Position, Position>> MOVING_BACK_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<Direction, Function<Position, Position>>() {
            {
              put(Direction.N, subY);
              put(Direction.W, addX);
              put(Direction.S, addY);
              put(Direction.E, subX);
            }
          });

  public static final Map<Gearbox, Map<Direction, Function<Position, Position>>> MOVING_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<Gearbox, Map<Direction, Function<Position, Position>>>() {
            {
              put(Gearbox.D, MOVING_FORWARD_COMMANDS);
              put(Gearbox.R, MOVING_BACK_COMMANDS);
            }
          });

  public static final Map<String, Function<Position, Position>> FORWARD_TURNING_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<String, Function<Position, Position>>() {
            {
              put("L", turnLeft);
              put("R", turnRight);
            }
          });

  public static final Map<String, Function<Position, Position>> BACK_TURNING_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<String, Function<Position, Position>>() {
            {
              put("L", turnRight);
              put("R", turnLeft);
            }
          });

  public static final Map<Gearbox, Map<String, Function<Position, Position>>> TURNING_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<Gearbox, Map<String, Function<Position, Position>>>() {
            {
              put(Gearbox.D, FORWARD_TURNING_COMMANDS);
              put(Gearbox.R, BACK_TURNING_COMMANDS);
            }
          });

  public static final Map<String, Gearbox> CHANGING_GEARBOX_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<String, Gearbox>() {
            {
              put("H", Gearbox.D);
              put("B", Gearbox.R);
            }
          });
}
