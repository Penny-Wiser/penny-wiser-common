package com.penniless.common.exception;

import java.text.MessageFormat;

import static com.penniless.common.exception.Constants.MESSAGE_DUPLICATE_ENTITY;
import static com.penniless.common.exception.Constants.MESSAGE_ENTITY_NOT_FOUND;
import static com.penniless.common.exception.Constants.MESSAGE_ENTITY_NOT_FOUND_2;
import static com.penniless.common.exception.Constants.MESSAGE_INTERNAL_SERVER_ERROR;
import static com.penniless.common.exception.Constants.MESSAGE_UNAUTHORIZED;

public class PWException {

  public PWException() {}

  public static RuntimeException throwException(ExceptionType exceptionType,EntityType entityType, String... args) {
    return throwNewException(exceptionType, entityType, args);
  }

  private static RuntimeException throwNewException(
      ExceptionType exceptionType, EntityType entityType, String... args) {

    switch (exceptionType) {
      case ENTITY_NOT_FOUND:
        return new EntityNotFoundException(MessageFormat.format(MESSAGE_ENTITY_NOT_FOUND, entityType.getValue(), args));
      case ENTITY_NOT_FOUND_2:
        return new EntityNotFoundException(MessageFormat.format(MESSAGE_ENTITY_NOT_FOUND_2, entityType.getValue(), args));
      case DUPLICATE_ENTITY:
        return new DuplicateEntityException(MessageFormat.format(MESSAGE_DUPLICATE_ENTITY, entityType.getValue(), args));
      case UNAUTHORIZED:
        return new UnauthorizedException(MESSAGE_UNAUTHORIZED);
      default:
        return new RuntimeException(MESSAGE_INTERNAL_SERVER_ERROR);
    }
  }

  public static class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
      super(message);
    }
  }

  public static class DuplicateEntityException extends RuntimeException {
    public DuplicateEntityException(String message) {
      super(message);
    }
  }

  public static class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) { super(message); }
  }
}
