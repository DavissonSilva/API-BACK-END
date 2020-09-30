package com.ListaTelefonica.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TB_OPERADORAS")
@Getter
@Setter
public class Operadoras extends AbstractEntity{
	
	private String nome;
	private int codigo;
	private int taxa;
	private String categoria;
	private double preco;
}
