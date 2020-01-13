package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
  @Test
  public void should_return_a_mars_rover_given_init_position_coordinates_and_direction() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.N);

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.N, marsRover.getDirection());
  }
}
