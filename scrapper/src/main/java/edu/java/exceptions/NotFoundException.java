package edu.java.exceptions;

public class NotFoundException extends RuntimeException {
    private final String description;

    public NotFoundException(String message, String description) {
        super(message);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
