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

import com.comment.demo.models.Usuario;

import com.comment.demo.service.UsuarioService;

@Controller     
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result,
			RedirectAttributes flash, Model model) {
		usuarioService.save(usuario);
		flash.addFlashAttribute("success", "Usuario entrega creada con exito");

		return "listar";
	}

}
