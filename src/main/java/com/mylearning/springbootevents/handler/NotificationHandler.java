package com.mylearning.springbootevents.handler;

import com.mylearning.springbootevents.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotificationHandler {
    @Async
    @EventListener
    public void notify(PatientDischargeEvent event) {
        System.out.println("Notification Service: Sending discharge notification for patient "
                + event.getPatientName() + " : " + Thread.currentThread().getName());
    }
}
