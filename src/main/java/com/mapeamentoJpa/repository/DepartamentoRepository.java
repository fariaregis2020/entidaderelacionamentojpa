package com.mapeamentoJpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mapeamentoJpa.entities.Departamento;

@Repository
@Transactional
public interface DepartamentoRepository extends CrudRepository< Departamento, Long> {

}
