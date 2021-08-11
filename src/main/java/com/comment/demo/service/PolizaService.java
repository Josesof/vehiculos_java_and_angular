package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Poliza;
import com.comment.demo.models.PolizaRepository;

@Service
public class PolizaService {
	@Autowired
	private PolizaRepository polizaRepository;
	
	
	public List<Poliza> findAll() {
		// TODO Auto-generated method stub
		return (List<Poliza>) polizaRepository.findAll();
	}
	
	public void save(Poliza poliza) {
		polizaRepository.save(poliza);

	}
	
	public Poliza findOne(Long id) {
		// TODO Auto-generated method stub
		return polizaRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		polizaRepository.deleteById(id);

	}

}
