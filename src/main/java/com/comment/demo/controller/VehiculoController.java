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

import com.comment.demo.models.Vehiculo;
import com.comment.demo.service.VehiculoService;


@Controller
public class VehiculoController {
	
	
	@Autowired
	private VehiculoService  vehiculoService;
	
	@RequestMapping(value = "/vehiculo", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("vehiculo") Vehiculo vehiculo, BindingResult result,
			RedirectAttributes flash, Model model) {
		vehiculoService.save(vehiculo);
		flash.addFlashAttribute("success", "Vehiculo entrega creada con exito");

		return "listar";
	}


}
