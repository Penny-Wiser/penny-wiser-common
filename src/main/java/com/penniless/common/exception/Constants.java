package com.penniless.common.exception;

public final class Constants {
  public static final String MESSAGE_ENTITY_NOT_FOUND = "Requested {0} with Id - {1} does not exist.";
  public static final String MESSAGE_DUPLICATE_ENTITY = "{0} with email - {1} already exists.";
  public static final String MESSAGE_UNAUTHORIZED = "Unauthorized - Invalid user email or password.";
  public static final String MESSAGE_INTERNAL_SERVER_ERROR = "Internal Server Error.";
}
//
//      case "user.not.found":
//          return "Requested user with id - {0} does not exist.";
//          case "user.not.found.2":
//          return "Requested user with email - {0} does not exist.";
//          case "user.duplicate":
//          return "User with email - {0} already exists.";
//default:
//    return "Other exceptions";