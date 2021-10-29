package com.veiculos.cfc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veiculos.cfc.model.Cliente;
import com.veiculos.cfc.model.ListagemVeiculos;

@Repository
public interface ListagemVeiculosRepository extends JpaRepository <ListagemVeiculos, Long>{
	

}
