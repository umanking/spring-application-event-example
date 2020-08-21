package com.example.demo;

import com.example.demo.event.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
@Component
@Slf4j
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher publisher;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Event> eventList = new ArrayList<>();

        IntStream.range(0, 100).forEach(
                i -> eventList.add(new Event("이벤트 " + i))
        );

        eventList.forEach(event -> {
            log.info("publish event : " + Thread.currentThread().getName() + ", " + event);
            publisher.publishEvent(event);
        });


//        publisher.publishEvent(new Event("hello world"));

        // generic event
        /*final GenericEvent<String> event = new GenericEvent<>("hello world", true);
        publisher.publishEvent(event);*/

    }
}
