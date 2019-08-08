package com.letsstartcoding.springbootrestapiexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Patient;
import com.letsstartcoding.springbootrestapiexample.repository.PatientRepository;


@Service
public class PatientDAO {
	@Autowired
PatientRepository patientRepository;
	
	/*to save patient*/
	public Patient save(Patient pat) {
		return patientRepository.save(pat);
	}
	
	
	
	
	
	
	
}
