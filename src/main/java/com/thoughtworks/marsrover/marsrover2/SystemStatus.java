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
}
