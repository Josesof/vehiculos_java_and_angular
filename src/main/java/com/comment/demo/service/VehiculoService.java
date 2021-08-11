package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Vehiculo;
import com.comment.demo.models.VehiculoRepository;

@Service
public class VehiculoService {
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	
	public List<Vehiculo> findAll() {
		
		return (List<Vehiculo>) vehiculoRepository.findAll();
	}
	
	public void save(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);

	}
	
	public Vehiculo findOne(Long id) {
		
		return vehiculoRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		vehiculoRepository.deleteById(id);

	}


}
