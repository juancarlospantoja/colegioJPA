package com.juancarlospantoja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.juancarlospantoja.Entity.Estudiante;
import com.juancarlospantoja.services.EstudianteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("estudiantes")
public class EstudianteController {
	@Autowired
	EstudianteService estudianteService;
	
	@GetMapping
	public ArrayList<Estudiante> getAsignatura() {
		return (ArrayList<Estudiante>) this.estudianteService.getEstudiante();
	}
	
	@PostMapping
	public Estudiante addEstudiante(@RequestBody Estudiante estudiante) {
		return estudianteService.addEstudiante(estudiante);
	} 	
}
