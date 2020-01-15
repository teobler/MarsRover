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

  @Test
  public void should_return_0_1_N_given_0_0_N_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N);

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_1_0_E_given_0_0_E_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E);

    marsRover.execute("M");

    assertEquals(1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_minus1_S_given_0_0_S_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S);

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(-1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_minus1_0_W_given_0_0_W_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W);

    marsRover.execute("M");

    assertEquals(-1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }
}
