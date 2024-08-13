package com.shivam.rest_api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.CanditateInfoDTO;
import com.shivam.rest_api.entity.Candidate;
import com.shivam.rest_api.service.CandidateService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class CandidateControllor {

	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/addCandidateInfo")
	public String addCandidateInfo(@RequestBody CanditateInfoDTO dto ) {
		//candidateService.addCandidateInfo(dto)
		return candidateService.addCandidateInfo(dto);
	}
	
	@GetMapping("/getCandidate/{email}")
	public Optional<Candidate> getCandidateByEmail(@PathVariable("email") String email) {
		return candidateService.getCandidateByEmail(email);
	}
	
	@PutMapping("/updateContact/{contact}/{email}")
	public int updateContactByEmail(@PathVariable Long contact, @PathVariable String email) {
		
		return candidateService.updateContactByEmail(contact, email);
	}
	
//	@GetMapping("/getCandidate/{email}")
//	public Optional<Candidate> getCandidateByEmailAndGender(@PathVariable(name = "email")String cEmail,@RequestParam String gender){
//		
//	}
	
}
