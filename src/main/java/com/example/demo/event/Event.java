package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
public class Event {

    private String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "message='" + message + '\'' +
                '}';
    }
}
