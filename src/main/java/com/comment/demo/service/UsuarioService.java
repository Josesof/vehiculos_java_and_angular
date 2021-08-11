package com.comment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.demo.models.Usuario;
import com.comment.demo.models.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);

	}
	
	public Usuario findOne(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		usuarioRepository.deleteById(id);

	}

}
