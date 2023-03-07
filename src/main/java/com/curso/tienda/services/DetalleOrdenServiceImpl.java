package com.curso.tienda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.tienda.entitIes.DetalleOrden;
import com.curso.tienda.repository.DetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService {
	
	@Autowired
	private DetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}
