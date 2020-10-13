package com.example.rest.restAccenture.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes", schema = "sistemacaixa")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "DataCadastro", columnDefinition="DATETIME")	
	private Date data_cadastro;
	
	@Column(name="Nome")
	private String 	nome;
	
	@Column( name="Cpf_Cnpj",length=14,nullable=false)
	private String cpf;
	

	@Column(name="Logradouro", length=50,nullable=false)
	private String logradouro;
	

	@Column(name="Cidade", length=50,nullable=false)
	private String cidade;


	@Column(name="UF", length=02,nullable=false)
	private String uf;
	
	@Column(name="CEP", length=10,nullable=false)
	private String cep;
	
	@Column(name="Telefone", length=11,nullable=false)
	private String telefone;
	
	@Column(name="Email", length=100,nullable=false)
	private String email;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	


	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
	
	
}
