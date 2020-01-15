package com.thoughtworks.marsrover.marsrover2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Position {
  private Coordinates coordinates;
  private Direction direction;
}
