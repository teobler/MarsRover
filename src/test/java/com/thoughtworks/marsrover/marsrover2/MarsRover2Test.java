package com.thoughtworks.marsrover.marsrover2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRover2Test {
  @Test
  public void should_return_a_mars_rover_given_init_position_coordinates_and_direction() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N);

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }
}
