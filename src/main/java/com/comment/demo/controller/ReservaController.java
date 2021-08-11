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


import com.comment.demo.models.Reserva;
import com.comment.demo.service.ReservaService;



@Controller
public class ReservaController {
	
	@Autowired
	private ReservaService  reservaService;
	
	@RequestMapping(value = "/reserva", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("reserva") Reserva reserva, BindingResult result,
			RedirectAttributes flash, Model model) {
		reservaService.save(reserva);
		flash.addFlashAttribute("success", "Actata entrega creada con exito");

		return "listar";
	}

}
