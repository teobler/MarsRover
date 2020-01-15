package com.thoughtworks.marsrover.marsover3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRover3Test {
  @Test
  public void should_return_0_0_N_given_0_0_N_to_init_a_mars_rover() {
    MarsRover3 marsRover = MarsRover3.init(0, 0, Direction.N);

    assertEquals(0, marsRover.getPosition().getX());
    assertEquals(0, marsRover.getPosition().getY());
    assertEquals(Direction.N, marsRover.getDirection());
  }
}
