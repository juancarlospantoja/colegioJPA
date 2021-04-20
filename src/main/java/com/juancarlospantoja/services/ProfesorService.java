package com.juancarlospantoja.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.juancarlospantoja.Entity.Profesor;
import com.juancarlospantoja.repositories.ProfesorRepository;

@Service
public class ProfesorService {
	@Autowired
	ProfesorRepository profesorRepository;
	
	public List<Map<String,Object>> getCurso(int prof) {
		List<Map<String,Object>> list = profesorRepository.getProfesor(prof);
		return list;
	}
	
	public ArrayList<Profesor> getProfesor() {
		return (ArrayList<Profesor>) profesorRepository.findAll();
	}
}
