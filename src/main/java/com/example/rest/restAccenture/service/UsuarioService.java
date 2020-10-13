package com.example.rest.restAccenture.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.rest.restAccenture.model.Usuario;

public interface UsuarioService extends JpaRepository<Usuario, Integer> {
	
	Iterable<Usuario> findByNome(String Nome);	
	Iterable<Usuario> findByEmail(String Email);
	
	
	Iterable<Usuario> findByLogin(String login);
	List<Usuario> findByLoginContains(String login);//aqui é uma consulta DSL Valida
	Iterable<Usuario> findBySenha(String senha);
	
	Iterable<Usuario> findByLoginAndSenha(String login, String senha);
	
	


}