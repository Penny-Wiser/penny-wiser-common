package com.penniless.common.exception;

public enum EntityType {
  BILL("Bill"),
  USER("User"),
  SYSTEM("System");

  String value;

  EntityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
