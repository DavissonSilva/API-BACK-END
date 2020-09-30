package com.ListaTelefonica.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ListaTelefonica.apirest.models.Agenda;
import com.ListaTelefonica.apirest.models.Operadoras;

public interface OperadorasRepository extends JpaRepository<Operadoras, Long>{
	
	Operadoras findById(long id);

}
