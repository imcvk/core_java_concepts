package org.advanced_java.exception_handling.customException;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
