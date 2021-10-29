package com.veiculos.cfc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.veiculos.cfc.model.Cliente;
import com.veiculos.cfc.model.Veiculo;
import com.veiculos.cfc.repository.ClienteRepository;
import com.veiculos.cfc.repository.VeiculoRepository;

@RestController
@RequestMapping("/Veiculos")

public class VeiculoController {
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public List<Veiculo> listar(){
		return veiculoRepository.findAll();
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo adicionar(@RequestBody Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
		
	}
	
	
	
			


