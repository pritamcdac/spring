package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Tutorial;

@Service
public class TutorialService {
	private List<Tutorial> tutorialList = new ArrayList<>();
	
	public TutorialService() {
		tutorialList.add(new Tutorial(1, "Java", "Java Tutorial"));
		tutorialList.add(new Tutorial(2, "C", "C Tutorial"));
		tutorialList.add(new Tutorial(3, "C++", "C++ Tutorial"));
		tutorialList.add(new Tutorial(4, ".net", ".net Tutorial"));
		tutorialList.add(new Tutorial(5, "Database", "Database Tutorial"));
	}

	public List<Tutorial> getTutorials() {
		return tutorialList;
	}

	public void addTutorial(Tutorial tutorial) {
		tutorialList.add(tutorial);
	}
	
	public Tutorial getTutorialById(int id) {
		for(Tutorial tutorial : tutorialList) {
			if(tutorial.getTutorialId()==id)
				return tutorial;
		}
		return null;
	}
	
	public Tutorial getById(int id) {
		Tutorial tutorial1= tutorialList.stream().filter(tutorial->tutorial.getTutorialId()==id).findFirst().get();
		return tutorial1;
	}

	public void deleteTutorial(Tutorial tutorial) {
		tutorialList.remove(tutorial);
	}
}
