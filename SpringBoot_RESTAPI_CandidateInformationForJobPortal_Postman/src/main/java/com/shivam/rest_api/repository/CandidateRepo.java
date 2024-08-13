package com.shivam.rest_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shivam.rest_api.entity.Candidate;

import jakarta.transaction.Transactional;

@Transactional
public interface CandidateRepo extends JpaRepository<Candidate, Integer> {

	Optional<Candidate> findByEmail(String email);
	
	@Modifying
    @Query("UPDATE Candidate c SET c.contact = :contact WHERE c.email = :email")
    int updateCandidateContactByEmail(@Param("contact") long contact, @Param("email") String email);
	
	Optional<Candidate> findByEmailAndGender(Integer pin,String gender);
}

