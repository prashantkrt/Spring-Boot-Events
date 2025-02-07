package com.mylearning.springbootevents.dto;

import lombok.Data;

@Data
public class PatientDischargeRequestDto {
    private String patientId;
    private String patientName;
}
