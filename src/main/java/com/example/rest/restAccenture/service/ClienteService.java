package com.example.rest.restAccenture.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.rest.restAccenture.model.Cliente;

public interface ClienteService extends JpaRepository<Cliente, Integer> {

	
 Iterable<Cliente> findByNome(String Nome);
 Iterable<Cliente> findByCpf(String Cpf);
 Iterable<Cliente> findByCidade(String Cidade);
 Iterable<Cliente> findByUf(String Uf);
	
	
}
