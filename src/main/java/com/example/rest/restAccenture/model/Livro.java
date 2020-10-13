package com.example.rest.restAccenture.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;


@Entity
@Table(name = "livro_caixa", schema = "sistemacaixa")
public class Livro  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="idCliente")	
	private Cliente cliente;

	
	@Column(name = "DataLançamento", columnDefinition="DATE")	
	private Date datalancamento;
	

	@Column( name="Descricao",length=50,nullable=false)
	private String descricao;
	
	@Column(name="Tipo", length=01,nullable=false)
	private String tipo;
	
	@Column( name="Valor",columnDefinition="Decimal(10,2)",nullable=true)
	private Double valor;
	
	
	@Column( name="Saldo",columnDefinition="Decimal(10,2)",nullable=true)
	private Double saldo;
	
	
	
	


	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	

	public Date getDatalancamento() {
		return datalancamento;
	}

	public void setDatalancamento(Date datalancamento) {
		this.datalancamento = datalancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
}
