package com.veiculos.cfc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.veiculos.cfc.model.Cliente;
import com.veiculos.cfc.model.ListagemVeiculos;
import com.veiculos.cfc.model.Veiculo;
import com.veiculos.cfc.repository.ClienteRepository;
import com.veiculos.cfc.repository.ListagemVeiculosRepository;

@RestController
@RequestMapping("/ListagemVeiculos")

public class ListagemVeiculosController {
	@Autowired
	private ListagemVeiculosRepository listagemVeiculosRepository;
	
	@GetMapping
	public List<ListagemVeiculos> listar(){
		return listagemVeiculosRepository.findAll();

}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ListagemVeiculos adicionar(@RequestBody ListagemVeiculos listagemVeiculos) {
		return listagemVeiculosRepository.save(listagemVeiculos);
	}}

