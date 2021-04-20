package com.juancarlospantoja.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancarlospantoja.Entity.Colegio;
import com.juancarlospantoja.repositories.ColegioRepository;

@Service
public class ColegioService {
	
	@Autowired
	ColegioRepository colegioRepository;
	
	public ArrayList<Colegio> getColegio() {
		return (ArrayList<Colegio>) colegioRepository.findAll();
	}
	
	public Colegio addColegio(Colegio colegio) {
		return colegioRepository.save(colegio);
	}
}
