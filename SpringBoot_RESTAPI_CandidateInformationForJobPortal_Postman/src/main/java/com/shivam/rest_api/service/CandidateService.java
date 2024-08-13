package com.shivam.rest_api.service;

import java.util.Optional;

import com.shivam.rest_api.dto.CanditateInfoDTO;
import com.shivam.rest_api.entity.Candidate;

public interface CandidateService {
	String addCandidateInfo( CanditateInfoDTO dto );
	
	Optional<Candidate> getCandidateByEmail( String email);
	
	int updateContactByEmail( Long contact, String email);
}
