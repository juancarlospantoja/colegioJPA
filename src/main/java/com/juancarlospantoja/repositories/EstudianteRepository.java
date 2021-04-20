package com.juancarlospantoja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.juancarlospantoja.Entity.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long>{	

}
