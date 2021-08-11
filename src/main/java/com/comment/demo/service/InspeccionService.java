package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Inspeccion;
import com.comment.demo.models.InspeccionRepository;

@Service
public class InspeccionService {
	
	@Autowired
	private InspeccionRepository inspeccionRepository;
	
	
	public List<Inspeccion> findAll() {
		// TODO Auto-generated method stub
		return (List<Inspeccion>) inspeccionRepository.findAll();
	}
	
	public void save(Inspeccion inspeccion) {
		inspeccionRepository.save(inspeccion);

	}
	
	public Inspeccion findOne(Long id) {
		// TODO Auto-generated method stub
		return inspeccionRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		inspeccionRepository.deleteById(id);

	}

}
