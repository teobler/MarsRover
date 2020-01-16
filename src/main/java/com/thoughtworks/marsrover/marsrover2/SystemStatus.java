package com.thoughtworks.marsrover.marsrover2;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class SystemStatus {
  private Map<String, Boolean> systemStatus = new HashMap<String, Boolean>() {{
    put("M", true);
    put("L", true);
    put("R", true);
    put("B", true);
    put("H", true);
  }};

  public void changeMovingStatus() {
    this.systemStatus.replace("M", !this.systemStatus.get("M"));
  }

  public void changeTurningLeftStatus() {
    this.systemStatus.replace("L", !this.systemStatus.get("M"));
  }

  public void changeTurningRightStatus() {
    this.systemStatus.replace("R", !this.systemStatus.get("M"));
  }

  public void changeBackingStatus() {
    this.systemStatus.replace("B", !this.systemStatus.get("M"));
  }

  public void changeAheadStatus() {
    this.systemStatus.replace("H", !this.systemStatus.get("M"));
  }
}
