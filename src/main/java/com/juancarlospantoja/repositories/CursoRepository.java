package com.juancarlospantoja.repositories;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.juancarlospantoja.Entity.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{	
	@Query(value="select distinct p.nombre,a.nombre asignatura,c.grado || '' || c.salon curso, e.nombre estudiante,e.id id_estudiante from asignatura a join curso c on a.curso = c.id join profesor p on p.id = a.profesor join asignatura_estudiante ae on ae.asignatura_id=a.id join estudiante e on e.id=ae.estudiante_id where a.id=(?2) and a.profesor =  (?1) order by e.id",nativeQuery = true)
	List<Map<String,Object>> getCurso(int prof,int curso);	
}
