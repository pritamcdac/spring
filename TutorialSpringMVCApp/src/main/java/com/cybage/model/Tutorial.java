package com.cybage.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Tutorial {
	@Min(100)
	@Max(10001)
	private int tutorialId;
	@NotBlank(message="Name can't be blank")
	private String tutorialName;
	@NotBlank
	@Size(min=4,max=10)
	private String description;

	public Tutorial() {
		super();
	}

	public Tutorial(int tutorialId, String tutorialName, String description) {
		super();
		this.tutorialId = tutorialId;
		this.tutorialName = tutorialName;
		this.description = description;
	}

	public int getTutorialId() {
		return tutorialId;
	}

	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}

	public String getTutorialName() {
		return tutorialName;
	}

	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Tutorial [tutorialId=" + tutorialId + ", tutorialName=" + tutorialName + ", description=" + description
				+ "]";
	}

}
