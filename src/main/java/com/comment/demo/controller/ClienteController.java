package com.comment.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.comment.demo.models.Cliente;
import com.comment.demo.service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteService ClienteService;

	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public List<Cliente> clientes() {

		return ClienteService.findAll();
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {

		return ClienteService.save(cliente);

	}

	@GetMapping("/ver/{id}")
	public Cliente show(@PathVariable Long id) {
		return ClienteService.findOne(id);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActual = ClienteService.findOne(id);

		clienteActual.setTipo_documento(cliente.getTipo_documento());
		clienteActual.setDocumento(cliente.getDocumento());
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setDireccion(cliente.getDireccion());
		clienteActual.setCodigo_postal(cliente.getCodigo_postal());
		clienteActual.setNumero_telefono1(cliente.getNumero_telefono1());
		clienteActual.setNumero_telefono2(cliente.getNumero_telefono2());
		clienteActual.setCorreo_electronico(cliente.getCorreo_electronico());
		clienteActual.setGenero(cliente.getGenero());
		clienteActual.setFecha_nacimiento(cliente.getFecha_nacimiento());
		clienteActual.setNivel_estudio(cliente.getNivel_estudio());
		clienteActual.setLicencia_conduccion(cliente.getLicencia_conduccion());
		clienteActual.setFecha_vencimiento_licencia(cliente.getFecha_vencimiento_licencia());
		clienteActual.setContrasena(cliente.getContrasena());

		return ClienteService.save(clienteActual);
	}
	
	
	@DeleteMapping("/eliminar")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delet(@PathVariable Long id) {
		ClienteService.delete(id);
	}

}
