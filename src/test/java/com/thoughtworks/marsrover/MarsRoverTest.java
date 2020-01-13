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

  @Test
  public void should_return_0_1_N_given_0_0_N_and_move_forward() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.N);

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(1, marsRover.getPosition().getPositionY());
    assertEquals(Direction.N, marsRover.getDirection());
  }
}
