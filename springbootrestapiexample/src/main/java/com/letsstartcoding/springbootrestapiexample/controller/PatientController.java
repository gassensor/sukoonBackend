package com.letsstartcoding.springbootrestapiexample.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.dao.PatientDAO;
import com.letsstartcoding.springbootrestapiexample.model.Patient;

@RestController
@RequestMapping("/hospital")
public class PatientController {
	PatientDAO patientDAO;
	
/*to save a patient*/
	@PostMapping("/patients")
	public Patient createPatient(@Valid @RequestBody Patient pat) {
		return patientDAO.save(pat);
	}
}
