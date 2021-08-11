package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Reserva;
import com.comment.demo.models.ReservaRepository;

@Service
public class ReservaService {
	@Autowired
	private ReservaRepository reservaRepository;
	
	
	public List<Reserva> findAll() {
		// TODO Auto-generated method stub
		return (List<Reserva>) reservaRepository.findAll();
	}
	
	public void save(Reserva reserva) {
		reservaRepository.save(reserva);

	}
	
	public Reserva findOne(Long id) {
		// TODO Auto-generated method stub
		return reservaRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		reservaRepository.deleteById(id);

	}


}
