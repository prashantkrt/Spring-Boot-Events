package com.mylearning.springbootevents.service;

import org.springframework.stereotype.Service;

@Service
public interface PatientDischargeService {
    String dischargePatient(String patientId, String patientName);
}
