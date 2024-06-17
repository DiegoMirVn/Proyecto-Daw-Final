package com.curso.service;




import com.curso.model.Terapeuta;

public interface ServiceTerapeuta {

	Terapeuta buscarTerapeutaPorId();

	void insertarTerapeuta(Terapeuta terapeuta);

	void actualizarTerapeuta();

	void eliminarTerapeuta();

}
