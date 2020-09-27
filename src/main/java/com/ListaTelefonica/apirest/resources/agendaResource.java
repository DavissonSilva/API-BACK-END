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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.ListaTelefonica.apirest.models.Agenda;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST AGENDA")
@CrossOrigin(origins = "*")
public class agendaResource {

	@Autowired
	AgendaRepository agendaRepository;
	
	/*
	 Metado abaixo e resposavel por trazer dados do banco 
	 **/
	@GetMapping("/agenda")
	@ApiOperation(value="Retorna uma lista de contatos")
	public List<Agenda> ListaContatos(){   
		return agendaRepository.findAll();
		
	}
	/*
	 esse metado vai fazer um filtro e trazer do banco e apenas os pesquisandos  
	 **/
	@GetMapping("/agenda/{id}")
	@ApiOperation(value="Retorna um contato unico")
	public Agenda ListaContatosUnico(@PathVariable(value="id")long id){
		return agendaRepository.findById(id);
		
	}
	
	@PostMapping("/agenda")
	@ApiOperation(value="Salva contatos na agenda")
	public Agenda salvaContato(@RequestBody Agenda agenda) {
		return agendaRepository.save(agenda);
	}
	
	@DeleteMapping("/agenda")
	@ApiOperation(value="deleta um contato")
	public void deletaContato(@RequestBody Agenda agenda) {
		agendaRepository.delete(agenda);
	}
	
	@PutMapping("/agenda")
	@ApiOperation(value="atualiza um contato")
	public Agenda atualizaContato(@RequestBody Agenda agenda) {
	return agendaRepository.save(agenda);
	}
}
