package com.curso.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.DaoTerapeuta;
import com.curso.model.Terapeuta;

@Service
public class ServiceTerapeutaImpl implements ServiceTerapeuta {

	@Autowired
	DaoTerapeuta dao;

	@Override
	public void insertarTerapeuta(Terapeuta terapeuta) {

		dao.save(terapeuta);

	}

	@Override
	public Terapeuta buscarTerapeutaPorId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarTerapeuta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarTerapeuta() {
		// TODO Auto-generated method stub

	}

}
