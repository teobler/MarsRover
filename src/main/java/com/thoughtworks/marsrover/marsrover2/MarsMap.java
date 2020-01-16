package com.thoughtworks.marsrover.marsrover2;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class MarsMap {
  ArrayList<Coordinates> taggedPitCoordinates = new ArrayList<>();

  public void tagPit(Coordinates pitCoordinates) {
    this.taggedPitCoordinates.add(pitCoordinates);
  }
}
