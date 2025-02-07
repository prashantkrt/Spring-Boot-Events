package com.mylearning.springbootevents.handler;

import com.mylearning.springbootevents.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordHandler {

    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent event) {
        System.out.println("Medical Records Service: Updating records for patient "
                + event.getPatientId() + " : " + Thread.currentThread().getName());
    }
}
