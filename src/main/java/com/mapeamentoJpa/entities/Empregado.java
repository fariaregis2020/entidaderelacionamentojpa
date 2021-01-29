package com.mapeamentoJpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Empregado implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private double salario;
	private String cargo;
	@ManyToOne
	private Departamento departmento;
	
	
		
	public Empregado () {
		
	}

	public Empregado(long id, String nome, double salario, String cargo, Departamento departmento) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.departmento = departmento;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public double getSalario() {
		return salario;
	}




	public void setSalario(double salario) {
		this.salario = salario;
	}




	public String getcargo() {
		return cargo;
	}




	public void setcargo(String cargo) {
		this.cargo = cargo;
	}




	public Departamento getDepartmento() {
		return departmento;
	}




	public void setDepartmento(Departamento departmento) {
		this.departmento = departmento;
	}
	
	
	

}
