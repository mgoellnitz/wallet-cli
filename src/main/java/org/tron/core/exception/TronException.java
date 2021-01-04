package org.tron.core.exception;

public class TronException extends Exception {

  private static final long serialVersionUID = 206696367626485L;

  public TronException() {
    super();
  }

  public TronException(String message) {
    super(message);
  }

  public TronException(String message, Throwable cause) {
    super(message, cause);
  }

}
