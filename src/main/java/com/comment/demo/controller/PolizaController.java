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

import com.comment.demo.models.Poliza;

import com.comment.demo.service.PolizaService;

@Controller
public class PolizaController {
	
	@Autowired
	private PolizaService polizaService;

	@RequestMapping(value = "/poliza", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("poliza") Poliza poliza, BindingResult result,
			RedirectAttributes flash, Model model) {
		polizaService.save(poliza);
		flash.addFlashAttribute("success", "Modalidad Alquiler creado con exito");

		return "listar";
	}


}
