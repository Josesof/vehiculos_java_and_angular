package com.comment.demo.models;

import org.springframework.data.repository.CrudRepository;



public interface UsuarioRepository extends CrudRepository< Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
