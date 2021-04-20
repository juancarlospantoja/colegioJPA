package com.juancarlospantoja.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.juancarlospantoja.Entity.Curso;
import com.juancarlospantoja.repositories.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository cursoRepository;
	
	public ArrayList<Curso> getCurso() {
		return (ArrayList<Curso>) cursoRepository.findAll();
	}
	
	
	public List<Map<String,Object>> getCurso(int prof,int curso) {
		List<Map<String,Object>> list = cursoRepository.getCurso(prof,curso);
		return list;
	}
	
	public Curso addCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
}
