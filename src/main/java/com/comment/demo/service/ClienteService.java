package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Cliente;
import com.comment.demo.models.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public Cliente save(Cliente cliente) {
		
		return clienteRepository.save(cliente);

	}
	
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		clienteRepository.deleteById(id);

	}

}
