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
import com.comment.demo.models.ModalidadAlquiler;
import com.comment.demo.service.ModalidadService;


@Controller
public class ModalidadAlController {
	
	@Autowired
	private ModalidadService modalidadService;

	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("modalidadAlquiler") ModalidadAlquiler modalidadAlquiler, BindingResult result,
			RedirectAttributes flash, Model model) {
		modalidadService.save(modalidadAlquiler);
		flash.addFlashAttribute("success", "Modalidad Alquiler creado con exito");

		return "listar";
	}


}
