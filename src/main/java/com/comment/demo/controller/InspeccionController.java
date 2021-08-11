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


import com.comment.demo.models.Inspeccion;
import com.comment.demo.service.InspeccionService;


@Controller
public class InspeccionController {

	
	
	@Autowired
	private InspeccionService inspeccionService;

	@RequestMapping(value = "/inspeccion", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("inspeccion") Inspeccion inspeccion, BindingResult result,
			RedirectAttributes flash, Model model) {
		inspeccionService.save(inspeccion);
		flash.addFlashAttribute("success", "Inspeccion creada con exito");

		return "listar";
	}
}
