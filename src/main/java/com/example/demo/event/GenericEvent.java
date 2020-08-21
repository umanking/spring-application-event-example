package com.example.demo.event;

import lombok.Data;

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
@Data
public class GenericEvent<T> {

    T what;
    boolean success;

    public GenericEvent(T what, boolean success) {
        this.what = what;
        this.success = success;
    }

    public T getWhat() {
        return what;
    }

    public void setWhat(T what) {
        this.what = what;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
