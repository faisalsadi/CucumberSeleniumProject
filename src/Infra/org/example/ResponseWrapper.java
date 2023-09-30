package org.example;

import lombok.Data;
@Data
public class ResponseWrapper<T> {
    private int status;
    private T data;

    public ResponseWrapper(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseWrapper() {
    }
}