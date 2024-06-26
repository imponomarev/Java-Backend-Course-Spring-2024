package edu.java.exceptions;

import edu.java.api.model.ApiErrorResponse;
import lombok.Getter;

@Getter
public class ApiErrorException extends RuntimeException {
    private final ApiErrorResponse apiErrorResponse;

    public ApiErrorException(ApiErrorResponse apiErrorResponse) {
        this.apiErrorResponse = apiErrorResponse;
    }
}
