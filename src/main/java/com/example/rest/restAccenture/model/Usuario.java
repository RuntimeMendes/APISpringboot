package com.example.rest.restAccenture.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



@Entity
@Table(name = "usuario", schema = "sistemacaixa")
public class Usuario  {//implements UserDetails

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	         
	     
	@Column(name = "DataCadastro", columnDefinition="DATETIME")	
    private Date data_cadastro;
	
	@Column( name="Nome",length=30,nullable=false)
	private String nome;
	 
	@Column( name="Login",length=15,nullable=false)
	private String login;
	
	@Column( name="Senha",length=10,nullable=false)
	private String senha;
	
	@Column( name="Telefone",length=11,nullable=true)
	private String telefone;	
	
	@Column( name="Email",length=100,nullable=true)
	private String email;
	
	@Column(name="Perfil", length=01,nullable=false)
	private char perfil;	
	
	@Column(name="Status", length=01,nullable=false)
	private char status;

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public char getPerfil() {
		return perfil;
	}

	public void setPerfil(char perfil) {
		this.perfil = perfil;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	
	
	
/*
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.Senha;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.Login;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
*/
	
	
}
