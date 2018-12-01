package com.fiap.aoj.ms.basicMicroservico.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fiap.aoj.ms.basicMicroservico.entity.Microservico;

public interface IMicroservicoService {
    
	Microservico create(Microservico microservico);
	Microservico get(Long id);
	Microservico edit(Microservico microservico);
    void delete(Microservico microservico);
    void deleteById(Long id);
    List getAll();
    long count();

}
