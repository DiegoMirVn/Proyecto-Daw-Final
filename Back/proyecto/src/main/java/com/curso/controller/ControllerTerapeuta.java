package com.curso.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Terapeuta;
import com.curso.service.ServiceTerapeuta;

@RestController

public class ControllerTerapeuta {

	@Autowired
	ServiceTerapeuta service;

	
	@CrossOrigin(origins = "C:\\Users\\6003070\\Desktop\\Fisio.com\\Front\\form-registro.html")
	@PostMapping(value = "/terapeuta", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertarTerapeuta(@RequestBody Terapeuta terapeuta) {
		service.insertarTerapeuta(terapeuta);
	}
	
	/*
	 * No se porque no funciona, nose si es por el CORS , por el eventlistener de js el boton, 
	 * o el aync await
	 * 
	 */

	public Terapeuta buscarTerapeutaPorId() {
		return null;

	}

	public void actualizarTerapeuta() {

	}

	public void eliminarTerapeuta() {

	}
}
