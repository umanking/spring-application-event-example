package com.example.demo.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
@Component
@Slf4j
public class EventHandler {

/*    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshEvent");
    }

    @EventListener
    @Async
    public void handle(ContextStartedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextStartedEvent");
    }

    @EventListener
    @Async
    public void handle(ContextStoppedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextStoppedEvent");
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }*/

    @Async
    @EventListener
    public void listenEvent(Event event) {
        log.info(Thread.currentThread().getName() + " thread :  listen event and message : " + event.getMessage());
    }

    // Generic 제대로 동작하지 않음
    @EventListener(condition = "#event.success")
    public void listener(GenericEvent<String> event) {
        log.info("listen event :" + event.getWhat());

    }

    // todo: transactionalEventListner 관련 테스트 작성해보기
    // https://cheese10yun.github.io/event-transaction/#null
    
}
