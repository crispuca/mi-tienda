package com.curso.tienda.services;

import java.util.List;
import java.util.Optional;

import com.curso.tienda.entitIes.Usuario;

public interface UsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);

}
