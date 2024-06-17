package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Terapeuta;

public interface DaoTerapeuta extends JpaRepository<Terapeuta, String>{

}
