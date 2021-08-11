package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Comvenio;
import com.comment.demo.models.ComveniosRepository;

@Service
public class ComveniosService {
	
	@Autowired
	private ComveniosRepository comveniosRepository;
	
	
	
	public List<Comvenio> findAll() {
		// TODO Auto-generated method stub
		return (List<Comvenio>) comveniosRepository.findAll();
	}
	
	public void save(Comvenio comvenios) {
		comveniosRepository.save(comvenios);

	}
	
	public Comvenio findOne(Long id) {
		// TODO Auto-generated method stub
		return comveniosRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		comveniosRepository.deleteById(id);

	}

}
