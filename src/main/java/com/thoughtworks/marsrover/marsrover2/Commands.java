package com.thoughtworks.marsrover.marsrover2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Commands {
  public static Function<Position, Position> addX =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX() + 1)
                      .Y(position.getCoordinates().getY())
                      .build())
              .build();

  public static Function<Position, Position> addY =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX())
                      .Y(position.getCoordinates().getY() + 1)
                      .build())
              .build();

  public static Function<Position, Position> subX =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX() - 1)
                      .Y(position.getCoordinates().getY())
                      .build())
              .build();

  public static Function<Position, Position> subY =
      position ->
          Position.builder()
              .direction(position.getDirection())
              .coordinates(
                  Coordinates.builder()
                      .X(position.getCoordinates().getX())
                      .Y(position.getCoordinates().getY() - 1)
                      .build())
              .build();

  public static final Map<Direction, Function<Position, Position>> MOVING_COMMANDS =
      Collections.unmodifiableMap(
          new HashMap<Direction, Function<Position, Position>>() {
            {
              put(Direction.N, addY);
              put(Direction.W, subX);
              put(Direction.S, subY);
              put(Direction.E, addX);
            }
          });
}
