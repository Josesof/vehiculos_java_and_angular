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

import com.comment.demo.models.TipoMoneda;
import com.comment.demo.service.TipoMonedaService;


@Controller
public class TipoMonedaController {
	
	@Autowired
	private TipoMonedaService  tipoMonedaService;
	
	@RequestMapping(value = "/moneda", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("tipoMoneda") TipoMoneda tipoMoneda, BindingResult result,
			RedirectAttributes flash, Model model) {
		tipoMonedaService.save(tipoMoneda);
		flash.addFlashAttribute("success", "Moneda entrega creada con exito");

		return "listar";
	}

}
