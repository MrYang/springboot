package com.zz.springboot.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationStartedEvent 监听器,其他的事件有ApplicationEnvironmentPreparedEvent,
 * ApplicationPreparedEvent, ApplicationReadyEvent, ApplicationFailedEvent
 */
public class ApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("application started");
    }
}
