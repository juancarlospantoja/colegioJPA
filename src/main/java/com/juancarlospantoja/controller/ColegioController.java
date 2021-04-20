package com.juancarlospantoja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juancarlospantoja.Entity.Colegio;
import com.juancarlospantoja.services.ColegioService;

@RestController
@RequestMapping("colegio")
public class ColegioController {
	@Autowired
	ColegioService colegioService;
	
	@GetMapping("nombre")
	public ArrayList<Colegio> getColegio(){
		return colegioService.getColegio();
	}
	
	@PostMapping
	public Colegio addColegio(@RequestBody Colegio colegio) {
		return colegioService.addColegio(colegio);
	} 	

}
