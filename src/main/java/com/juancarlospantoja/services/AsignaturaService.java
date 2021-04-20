package com.juancarlospantoja.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancarlospantoja.Entity.Asignatura;
import com.juancarlospantoja.repositories.AsignaturaRepository;

@Service
public class AsignaturaService {
	@Autowired
	AsignaturaRepository asignaturaRepository;
	
	public ArrayList<Asignatura> getAsignatura() {
		return (ArrayList<Asignatura>) asignaturaRepository.findAll();
	}
}
