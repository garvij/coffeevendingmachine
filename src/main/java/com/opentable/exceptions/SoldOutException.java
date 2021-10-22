package com.opentable.exceptions;

public class SoldOutException extends RuntimeException {

  public SoldOutException(String name) {
    super(String.format("%s is sold out", name));
  }

}
