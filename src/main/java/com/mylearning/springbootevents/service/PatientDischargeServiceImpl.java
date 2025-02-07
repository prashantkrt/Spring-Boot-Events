package com.mylearning.springbootevents.service;

import com.mylearning.springbootevents.event.PatientDischargeEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PatientDischargeServiceImpl implements PatientDischargeService {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public String dischargePatient(String patientId, String patientName) {
        log.info("patient discharge process initiated {} ", patientName);
//      billingService.bill();
//      updatePatientHistory.updatePatientHistory();
//      houseKeeping.cleanAndAssign();
//      notify.notifyPatients();

//      No Tight coupling, an Async process for got events
//      publishes an event is better
        applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));
        log.info("patient discharge process completed {} ", patientName);
        return "Patient " + patientName + " with ID " + patientId + " discharged successfully!";
    }
}
