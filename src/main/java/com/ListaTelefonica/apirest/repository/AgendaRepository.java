package com.ListaTelefonica.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ListaTelefonica.apirest.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
	
	Agenda findById(long id);

}
