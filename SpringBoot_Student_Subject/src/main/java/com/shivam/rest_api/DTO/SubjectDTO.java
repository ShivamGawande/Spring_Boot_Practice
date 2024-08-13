package com.shivam.rest_api.DTO;

public class SubjectDTO {
	
	private Long subjectId;
	private String subjectName;
	
	public SubjectDTO(Long subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}

	public SubjectDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
}
