package com.movie.user.management.common.code;

public enum StatusCode {
    OK(200, "OK"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    NOT_FOUND(404, "NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR");

    final int httpCode;
    final String httpStatus;

    StatusCode(int httpCode, String httpStatus) {
        this.httpCode = httpCode;
        this.httpStatus = httpStatus;
    }
}
