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

import com.comment.demo.models.ActaEntrega;
import com.comment.demo.service.ActaEntregaService;



@Controller
public class ActaController {
	
	@Autowired
	private ActaEntregaService actaEntregaService;
	

	@RequestMapping(value = "/actaentrega", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("acta") ActaEntrega acta, BindingResult result,
			RedirectAttributes flash, Model model) {
		actaEntregaService.save(acta);
		flash.addFlashAttribute("success", "Actata entrega creada con exito");

		return "listar";
	}
}
