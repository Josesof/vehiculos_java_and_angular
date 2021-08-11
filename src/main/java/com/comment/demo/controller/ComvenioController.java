package com.comment.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.comment.demo.models.Comvenio;
import com.comment.demo.models.ComveniosRepository;

@Controller
public class ComvenioController {
	
	@Autowired
	private ComveniosRepository comveniosRepository;
	

	@RequestMapping(value = "/comvenio", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("comvenio") Comvenio comvenio, BindingResult result,
			RedirectAttributes flash, Model model) {
		comveniosRepository.save(comvenio);
		flash.addFlashAttribute("success", "Comvenio creado con exito");

		return "listar";
	}

}
