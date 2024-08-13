package com.shivam.rest_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.CanditateInfoDTO;
import com.shivam.rest_api.dto.EducationDTO;
import com.shivam.rest_api.entity.Address;
import com.shivam.rest_api.entity.Candidate;
import com.shivam.rest_api.entity.Education;
import com.shivam.rest_api.repository.CandidateRepo;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	private CandidateRepo candidateRepo;
	
	@Override
	public String addCandidateInfo(CanditateInfoDTO dto) {
		Candidate c1=new Candidate();
		c1.setFname(dto.getFname());
		c1.setLname(dto.getLname());
		c1.setEmail(dto.getEmail());
		c1.setContact(dto.getContact());
		c1.setGender(dto.getGender());
		
		Address add=new Address();
		add.setArea(dto.getAddress().getArea());
		add.setCity(dto.getAddress().getCity());
		add.setState(dto.getAddress().getState());
		add.setPin(dto.getAddress().getPin());
		c1.setAddress(add);
		
		List<Education> educationList=new ArrayList<>();
		for(EducationDTO education:dto.getEducation()) {
			Education e1=new Education();
			e1.setStandard(education.getStandard());
			e1.setNameOfOrg(education.getNameOfOrg());
			e1.setPassedYear(education.getPassedYear());
			e1.setAvgPercentage(education.getAvgPercentage());
			educationList.add(e1);
		}
		c1.setEducation(educationList);
		
		candidateRepo.save(c1);
		return "Candidate Info Saved Successfully";
	}

	@Override
	public Optional<Candidate> getCandidateByEmail(String email) {
		
		return candidateRepo.findByEmail(email);
	}

	@Override
	public int updateContactByEmail(Long contact, String email) {
		
		return candidateRepo.updateCandidateContactByEmail(contact, email);
	}
	
	

}
