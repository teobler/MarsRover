package com.thoughtworks.marsrover.marsrover2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRover2Test {
  @Test
  public void should_return_a_mars_rover_given_init_position_coordinates_and_direction_and_gear_box() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D);

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_1_N_given_0_0_N_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D);

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_1_0_E_given_0_0_E_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D);

    marsRover.execute("M");

    assertEquals(1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_minus1_S_given_0_0_S_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.D);

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(-1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_minus1_0_W_given_0_0_W_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.D);

    marsRover.execute("M");

    assertEquals(-1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_N_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_E_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_S_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.D);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_W_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.D);

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_W_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.D);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_S_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.D);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_E_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_N_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D);

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_1_2_E_given_0_0_N_and_a_batch_of_commands() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D);

    marsRover.execute("LMMRMLM");

    assertEquals(-3, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_change_gearbox_to_r_given_command_b() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D);

    marsRover.execute("B");

    assertEquals(Gearbox.R, marsRover.getGearbox());
  }
}
