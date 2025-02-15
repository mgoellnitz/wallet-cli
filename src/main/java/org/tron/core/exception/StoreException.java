package org.tron.core.exception;

public class StoreException extends TronException {

  private static final long serialVersionUID = 206760558562654L;

  public StoreException() {
    super();
  }

  public StoreException(String message) {
    super(message);
  }

  public StoreException(String message, Throwable cause) {
    super(message, cause);
  }
}
