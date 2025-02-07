package com.mylearning.springbootevents.controller;

import com.mylearning.springbootevents.dto.PatientDischargeRequestDto;
import com.mylearning.springbootevents.service.PatientDischargeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge")
@RequiredArgsConstructor
public class DischargeProcessController {

    private final PatientDischargeService patientDischargeService;

    @PostMapping
    public ResponseEntity<String> dischargePatient(@RequestBody PatientDischargeRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.OK).body(patientDischargeService.dischargePatient(requestDto.getPatientId(), requestDto.getPatientName()));
    }
}
