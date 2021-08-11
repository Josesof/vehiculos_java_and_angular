package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.TipoMoneda;
import com.comment.demo.models.TipoMonedaRepository;

@Service
public class TipoMonedaService {
	
	@Autowired
	private TipoMonedaRepository tipoMonedaRepository;
	
	
	public List<TipoMoneda> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoMoneda>) tipoMonedaRepository.findAll();
	}
	
	public void save(TipoMoneda tipoMoneda) {
		tipoMonedaRepository.save(tipoMoneda);

	}
	
	public TipoMoneda findOne(Long id) {
		// TODO Auto-generated method stub
		return tipoMonedaRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		tipoMonedaRepository.deleteById(id);

	}


}
