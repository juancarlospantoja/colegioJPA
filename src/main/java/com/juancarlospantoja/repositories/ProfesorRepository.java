package com.juancarlospantoja.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.juancarlospantoja.Entity.Profesor;

@Repository
public interface ProfesorRepository extends  CrudRepository<Profesor, Long>{
	@Query(value="select  p.id id_profesor,p.nombre,a.nombre asignatura,c.grado || '' || c.salon curso,c.id id_curso, a.id id_asignatura from asignatura a join curso c on a.curso = c.id join profesor p on p.id = a.profesor where a.profesor =  (?1)",nativeQuery = true)
	List<Map<String,Object>> getProfesor(int prof);
}


