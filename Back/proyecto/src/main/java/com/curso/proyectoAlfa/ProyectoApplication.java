package com.curso.proyectoAlfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages = { "com.curso.service", "com.curso.controller", "com.curso.configuracion" }) //Añadir el CORS para que lo escanee
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}
