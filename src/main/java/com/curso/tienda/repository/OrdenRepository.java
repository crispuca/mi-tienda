package com.curso.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.tienda.entitIes.Orden;
import com.curso.tienda.entitIes.Usuario;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);
}
