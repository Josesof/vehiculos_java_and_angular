package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.ActaEntrega;

@Service
public class ActaEntregaService {

	
	@Autowired
	private ActaEntregaService actaEntregaService;
	
	
	public List<ActaEntrega> findAll() {
		// TODO Auto-generated method stub
		return (List<ActaEntrega>) actaEntregaService.findAll();
	}
	
	public void save(ActaEntrega actaEntrega) {
		actaEntregaService.save(actaEntrega);

	}
	
	public ActaEntrega findOne(Long id) {
		// TODO Auto-generated method stub
		return actaEntregaService.findOne(id);
	}
	
	public void delete(Long id) {
		actaEntregaService.delete(id);

	}
}
