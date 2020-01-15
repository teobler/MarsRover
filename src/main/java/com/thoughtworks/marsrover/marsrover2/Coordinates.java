package com.thoughtworks.marsrover.marsrover2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Coordinates {
  private int X;
  private int Y;
}
