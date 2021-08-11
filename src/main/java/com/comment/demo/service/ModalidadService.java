package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.ModalidadAlquiler;
import com.comment.demo.models.ModalidadRepository;

@Service
public class ModalidadService {
	
	
	@Autowired
	private ModalidadRepository ModalidadRepository;
	
	
	public List<ModalidadAlquiler> findAll() {
		// TODO Auto-generated method stub
		return (List<ModalidadAlquiler>) ModalidadRepository.findAll();
	}
	
	public void save(ModalidadAlquiler modalidadAlquiler) {
		ModalidadRepository.save(modalidadAlquiler);

	}
	
	public ModalidadAlquiler findOne(Long id) {
		// TODO Auto-generated method stub
		return ModalidadRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		ModalidadRepository.deleteById(id);

	}


}
