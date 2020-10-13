package com.example.rest.restAccenture.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.rest.restAccenture.model.Contabil;
import com.example.rest.restAccenture.model.Livro;

public interface ContabilService extends CrudRepository<Contabil,Integer> {

	 Iterable<Contabil> findById(int Id); 
	 
//SELECT * FROM sistemacaixa.livro_caixa
	/* inner join clientes
	 on livro_caixa.id_cliente = clientes.id
	 where livro_caixa.id_cliente = 2	*/ 
	 
	 
	/* SELECT  livro_caixa.data_lançamento, livro_caixa.descricao,livro_caixa.saldo,livro_caixa.tipo,livro_caixa.valor,clientes.nome,clientes.cpf_cnpj,clientes.telefone FROM sistemacaixa.livro_caixa
	 inner join clientes
	 on livro_caixa.id_cliente = clientes.id
	 where livro_caixa.id_cliente = 2*/
	 
	/* @Query("SELECT  livro_caixa.data_lançamento, livro_caixa.descricao,livro_caixa.saldo,livro_caixa.tipo,livro_caixa.valor,clientes.nome,clientes.cpf_cnpj,clientes.telefone FROM livro_caixa\r\n" + 
	 		"	 inner join clientes\r\n" + 
	 		"	 on livro_caixa.id_cliente = clientes.id\r\n" + 
	 		"	 where livro_caixa.id_cliente =:IdCliente " )
	 List<Livro> findByClienteId(@Param("IdCliente") int IdCliente);*/
	
	 
	
	
}
