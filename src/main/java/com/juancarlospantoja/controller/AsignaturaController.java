package com.juancarlospantoja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancarlospantoja.Entity.Asignatura;
import com.juancarlospantoja.services.AsignaturaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("asignaturas")
public class AsignaturaController {
	@Autowired
	AsignaturaService asignaturaService;
	
	@GetMapping
	public ArrayList<Asignatura> getAsignatura() {
		return (ArrayList<Asignatura>) this.asignaturaService.getAsignatura();
	}
}
