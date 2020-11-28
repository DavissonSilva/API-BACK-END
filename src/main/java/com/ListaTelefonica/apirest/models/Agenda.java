package com.ListaTelefonica.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_AGENDA")
@Getter
@Setter
public class Agenda extends AbstractEntity {

	
	private String nome;
	private String sobreNome;
	private String telefone;
	private Operadoras operadora;

}
