package com.curso.tienda.services;

import java.util.List;
import java.util.Optional;

import com.curso.tienda.entitIes.Orden;
import com.curso.tienda.entitIes.Usuario;

public interface OrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
