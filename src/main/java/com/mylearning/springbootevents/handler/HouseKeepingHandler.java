package com.mylearning.springbootevents.handler;

import com.mylearning.springbootevents.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingHandler {

    @Async
    @EventListener
    public void houseKeeping(PatientDischargeEvent event) {
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of "
                +event.getPatientName()+" : "+Thread.currentThread().getName());
    }
}
