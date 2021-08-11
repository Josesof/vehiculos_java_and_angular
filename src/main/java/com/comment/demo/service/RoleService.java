package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.comment.demo.models.Role;
import com.comment.demo.models.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return (List<Role>) roleRepository.findAll();
	}
	
	public void save(Role role) {
		roleRepository.save(role);

	}
	
	public Role findOne(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		roleRepository.deleteById(id);

	}


}
