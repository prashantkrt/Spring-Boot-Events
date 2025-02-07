package com.mylearning.springbootevents.handler;

import com.mylearning.springbootevents.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingHandler {

    @Async
    @EventListener
    public void bill(PatientDischargeEvent event) {
        System.out.println("Billing Service: Finalizing bill for patient "
                + event.getPatientId() + " : " + Thread.currentThread().getName());
    }
}
