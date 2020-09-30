package com.ListaTelefonica.apirest.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ListaTelefonica.apirest.repository.AgendaRepository;
import com.ListaTelefonica.apirest.repository.OperadorasRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.ListaTelefonica.apirest.models.Agenda;
import com.ListaTelefonica.apirest.models.Operadoras;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST AGENDA")
@CrossOrigin(origins = "*")
public class OperadoraResource {

	@Autowired
	OperadorasRepository operadorasRepository;
	
	/*
	 Metado abaixo e resposavel por trazer dados do banco 
	 **/
	@GetMapping("/operadoras")
	@ApiOperation(value="Retorna uma lista de operadora em json")
	public List<Operadoras> ListaOperadoras(){   
		return operadorasRepository.findAll();
		
	}
	/*
	 esse metado vai fazer um filtro e trazer do banco e apenas os pesquisandos  
	 **/
	@GetMapping("/operadoras/{id}")
	@ApiOperation(value="Retorna uma Operadora em json")
	public Operadoras ListaContatosUnico(@PathVariable(value="id")long id){
		return operadorasRepository.findById(id);
		
	}
	
	@PostMapping("/operadoras")
	@ApiOperation(value="Salva na agenda")
	public Operadoras salvaOperadoras(@RequestBody Operadoras operadoras) {
		return operadorasRepository.save(operadoras);
	}
	
	@DeleteMapping("/operadoras")
	@ApiOperation(value="deleta uma operadora")
	public void deletaOperadora(@RequestBody Operadoras operadoras) {
		operadorasRepository.delete(operadoras);
	}
	
	@PutMapping("/operadoras")
	@ApiOperation(value="atualiza uma operadora")
	public Operadoras atualizaContato(@RequestBody Operadoras operadoras) {
	return operadorasRepository.save(operadoras);
	}
}
