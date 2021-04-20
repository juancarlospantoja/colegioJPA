package com.juancarlospantoja.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.juancarlospantoja.Entity.Profesor;
import com.juancarlospantoja.services.ProfesorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("profesor")
public class ProfesorController {
	@Autowired
	ProfesorService profesorService;
	
	@GetMapping(path = "/{prof}")
	public List<Map<String,Object>> getCurso(@PathVariable("prof") int prof){
		return this.profesorService.getCurso(prof);
	}
	
	@GetMapping
	public ArrayList<Profesor> getProfesor(){
		return profesorService.getProfesor();
	}

}
