package com.juancarlospantoja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juancarlospantoja.Entity.Asignatura;

@Repository
public interface AsignaturaRepository extends CrudRepository<Asignatura, Long>{	


}
