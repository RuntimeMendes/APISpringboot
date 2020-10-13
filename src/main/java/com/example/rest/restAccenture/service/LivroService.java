package com.example.rest.restAccenture.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.rest.restAccenture.model.Livro;
import com.example.rest.restAccenture.model.Usuario;

public interface LivroService extends CrudRepository<Livro, Integer> {

	 Iterable<Livro> findById(int Id);  //
    // Iterable<Livro> findByCliente_id(int IdCliente);
     List<Livro> findByClienteId(int IdCliente);
     
	
     
}
