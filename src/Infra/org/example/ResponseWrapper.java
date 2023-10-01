package org.example;

import lombok.Data;
@Data
public class ResponseWrapper<T> {
    private boolean status;
    private T data;

    public ResponseWrapper(boolean status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseWrapper() {
    }
}