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

  @Test
  public void should_return_1_0_E_given_0_0_E_and_move_forward() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.E);

    marsRover.execute("M");

    assertEquals(1, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.E, marsRover.getDirection());
  }

  @Test
  public void should_return_0_minus1_S_given_0_0_S_and_move_forward() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.S);

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(-1, marsRover.getPosition().getPositionY());
    assertEquals(Direction.S, marsRover.getDirection());
  }

  @Test
  public void should_return_minus1_0_W_given_0_0_W_and_move_forward() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.W);

    marsRover.execute("M");

    assertEquals(-1, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.W, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_N_and_turn_right() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.N);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.E, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_E_and_turn_right() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.E);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.S, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_S_and_turn_right() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.S);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.W, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_W_and_turn_right() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.W);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.N, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_W_and_turn_left() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.W);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.S, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_S_and_turn_left() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.S);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.E, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_E_and_turn_left() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.E);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.N, marsRover.getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_N_and_turn_left() {
    MarsRover marsRover = MarsRover.init(0, 0, Direction.N);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getPositionX());
    assertEquals(0, marsRover.getPosition().getPositionY());
    assertEquals(Direction.W, marsRover.getDirection());
  }
}
