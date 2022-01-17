package com.springboot.backend.apirest.movie.service;

import com.springboot.backend.apirest.movie.entity.Usuario;

public interface UsuarioService {

	public Usuario findByUsername(String username);
}
