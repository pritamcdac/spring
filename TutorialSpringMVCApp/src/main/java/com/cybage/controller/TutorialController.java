package com.cybage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Tutorial;
import com.cybage.service.TutorialService;

@Controller
@RequestMapping("/api/tutorial")
public class TutorialController {

	@Autowired
	TutorialService tutorialService;

	@GetMapping("/")
	public ModelAndView getAllTutorial() {
		List<Tutorial> tutorialsList = tutorialService.getTutorials();
		return new ModelAndView("tutorial", "tList", tutorialsList);

	}
	
	@GetMapping("/addTutorial")
	public ModelAndView showForm() {
		Tutorial tutorial = new Tutorial();
		return new ModelAndView("addTutorial" , "tutorial" , tutorial);
	}
	
	
	@PostMapping("/")
	public ModelAndView addTutorial(@Valid @ModelAttribute Tutorial tutorial , BindingResult result) {
		if(result.hasErrors())
			return new ModelAndView("addTutorial" , "tutorial" , tutorial);
		tutorialService.addTutorial(tutorial);
		return new ModelAndView("tutorial" , "tList" ,  tutorialService.getTutorials());
	}
	
	@GetMapping("/deleteTutorial/{id}")
	public ModelAndView deleteTutorial(@PathVariable int id) {
		
		tutorialService.deleteTutorial(tutorialService.getTutorialById(id));
		return new ModelAndView("tutorial" , "tList" ,  tutorialService.getTutorials());

	}
}
