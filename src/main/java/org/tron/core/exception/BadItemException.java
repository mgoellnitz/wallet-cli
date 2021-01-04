package org.tron.core.exception;

public class BadItemException extends StoreException {

  private static final long serialVersionUID = 206802066067301L;

  public BadItemException() {
    super();
  }

  public BadItemException(String message) {
    super(message);
  }

  public BadItemException(String message, Throwable cause) {
    super(message, cause);
  }
}
