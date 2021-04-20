package com.juancarlospantoja.services;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancarlospantoja.Entity.Estudiante;
import com.juancarlospantoja.repositories.EstudianteRepository;


@Service
public class EstudianteService {
	@Autowired
	EstudianteRepository estudianteRepository;
	
	@PersistenceContext
    private EntityManager eM;
	
	public ArrayList<Estudiante> getEstudiante() {
		return (ArrayList<Estudiante>) estudianteRepository.findAll();
	}	
	
	public Estudiante addEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}	
	
}
