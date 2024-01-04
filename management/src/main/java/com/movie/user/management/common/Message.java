package com.movie.user.management.common;

import com.movie.user.management.common.code.StatusCode;
import lombok.Data;

@Data
public class Message {
    private StatusCode statusCode;
    private String message;
    private Object data;
}
