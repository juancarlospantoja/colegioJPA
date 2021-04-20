package com.juancarlospantoja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.juancarlospantoja.Entity.Colegio;

@Repository
public interface ColegioRepository extends CrudRepository<Colegio, Long>{

}
