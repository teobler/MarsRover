package com.thoughtworks.marsrover.marsrover2;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MarsRover2Test {
  @Test
  public void should_return_a_mars_rover_given_init_position_coordinates_and_direction_and_gear_box() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar(), new MarsMap());

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_1_N_given_0_0_N_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_1_0_E_given_0_0_E_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_1_S_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(0, 1, Direction.S, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_1_0_W_and_move_forward() {
    MarsRover2 marsRover = MarsRover2.init(1, 0, Direction.W, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_N_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_E_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_S_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_W_and_turn_right() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_W_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_S_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_E_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_N_and_turn_left() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_1_E_given_3_0_N_and_a_batch_of_commands() {
    Radar radar = mock(Radar.class);
    when(radar.scanIfInPit()).thenReturn(false);
    MarsRover2 marsRover = MarsRover2.init(3, 0, Direction.N, Gearbox.D, radar, new MarsMap());

    marsRover.execute("LMMRMLM");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_change_gearbox_to_r_given_command_b_and_init_gearbox_is_d() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("B");

    assertEquals(Gearbox.R, marsRover.getGearbox());
  }

  @Test
  public void should_change_gearbox_to_d_given_command_h_and_init_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("H");

    assertEquals(Gearbox.D, marsRover.getGearbox());
  }

  @Test
  public void should_change_position_to_1_0_N_given_init_position_1_1_N_and_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(1, 1, Direction.N, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_change_position_to_0_1_N_given_init_position_1_1_N_and_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(1, 1, Direction.E, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_change_position_to_1_2_N_given_init_position_1_1_S_and_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(1, 1, Direction.S, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(1, marsRover.getPosition().getCoordinates().getX());
    assertEquals(2, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_change_position_to_2_1_N_given_init_position_1_1_W_and_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(1, 1, Direction.W, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("M");

    assertEquals(2, marsRover.getPosition().getCoordinates().getX());
    assertEquals(1, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_N_and_turn_right_with_gearbox_is_l() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_E_and_turn_right_with_gearbox_is_l() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_S_and_turn_right_with_gearbox_is_l() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_W_and_turn_right_with_gearbox_is_l() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.R, new Radar(), new MarsMap());

    marsRover.execute("R");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_S_given_0_0_W_and_turn_left_with_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.W, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.S, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_S_and_turn_left_with_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.S, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_N_given_0_0_E_and_turn_left_with_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.E, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_W_given_0_0_N_and_turn_left_with_gearbox_is_r() {
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, new Radar(), new MarsMap());

    marsRover.execute("L");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.W, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_3_1_N_and_a_batch_of_commands_with_gearbox_is_r() {
    Radar radar = mock(Radar.class);
    when(radar.scanIfInPit()).thenReturn(false);
    MarsRover2 marsRover = MarsRover2.init(3, 1, Direction.N, Gearbox.R, radar, new MarsMap());

    marsRover.execute("LMMRMLM");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
  }

  @Test
  public void should_return_0_0_E_given_0_0_N_and_a_batch_of_commands_with_changing_gearbox() {
    Radar radar = mock(Radar.class);
    when(radar.scanIfInPit()).thenReturn(false);
    MarsRover2 marsRover = MarsRover2.init(1, 1, Direction.N, Gearbox.D, radar, new MarsMap());

    marsRover.execute("BLMMHRMLMB");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, marsRover.getPosition().getDirection());
    assertEquals(Gearbox.R, marsRover.getGearbox());
  }

  @Test
  public void should_return_a_new_mars_rover_when_old_mars_rover_fall_into_a_pit() {
    Radar radar = mock(Radar.class);
    when(radar.scanIfInPit()).thenReturn(true);
    MarsRover2 oldMarsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, radar, new MarsMap());

    MarsRover2 newMarsRover = oldMarsRover.execute("M");

    assertNotNull(newMarsRover);
    assertNotSame(oldMarsRover, newMarsRover);
    assertEquals(0, oldMarsRover.getPosition().getCoordinates().getX());
    assertEquals(1, oldMarsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, oldMarsRover.getPosition().getDirection());
    assertEquals(0, newMarsRover.getPosition().getCoordinates().getX());
    assertEquals(0, newMarsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, newMarsRover.getPosition().getDirection());
  }

  @Test
  public void should_tag_on_map_after_mars_rover_fall_into_a_pit() {
    Radar radar = mock(Radar.class);
    when(radar.scanIfInPit()).thenReturn(true);
    MarsRover2 oldMarsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, radar, new MarsMap());

    MarsRover2 newMarsRover = oldMarsRover.execute("M");

    assertEquals(1, oldMarsRover.getMarsMap().getTaggedPitCoordinates().size());
    assertEquals(0, oldMarsRover.getMarsMap().getTaggedPitCoordinates().get(0).getX());
    assertEquals(1, oldMarsRover.getMarsMap().getTaggedPitCoordinates().get(0).getY());
    assertEquals(1, newMarsRover.getMarsMap().getTaggedPitCoordinates().size());
    assertEquals(0, newMarsRover.getMarsMap().getTaggedPitCoordinates().get(0).getX());
    assertEquals(1, newMarsRover.getMarsMap().getTaggedPitCoordinates().get(0).getY());
  }

  @Test
  public void should_skip_command_if_next_step_is_a_pit_tagged_on_the_map() {
    Radar oldRadar = mock(Radar.class);
    when(oldRadar.scanIfInPit()).thenReturn(true);
    Radar newRadar = mock(Radar.class);
    when(newRadar.scanIfInPit()).thenReturn(false);
    MarsMap marsMap = new MarsMap();
    MarsRover2 oldMarsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, oldRadar, marsMap);
    oldMarsRover.execute("M");
    MarsRover2 newMarsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, newRadar, marsMap);

    newMarsRover.execute("MLMRMRM");

    assertEquals(0, newMarsRover.getPosition().getCoordinates().getX());
    assertEquals(2, newMarsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.E, newMarsRover.getPosition().getDirection());
  }

  @Test
  public void should_skip_m_command_if_mars_rovers_moving_status_is_false() {
    Radar radar = mock(Radar.class);
    when(radar.scanIfInPit()).thenReturn(false);
    MarsRover2 marsRover = MarsRover2.init(0, 0, Direction.N, Gearbox.D, radar, new MarsMap());
    marsRover.getSystemStatus().changeMovingStatus();

    marsRover.execute("M");

    assertEquals(0, marsRover.getPosition().getCoordinates().getX());
    assertEquals(0, marsRover.getPosition().getCoordinates().getY());
    assertEquals(Direction.N, marsRover.getPosition().getDirection());
  }
}
