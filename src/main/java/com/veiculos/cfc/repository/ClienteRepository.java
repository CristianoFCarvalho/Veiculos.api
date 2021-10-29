package com.veiculos.cfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veiculos.cfc.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{
	
}
