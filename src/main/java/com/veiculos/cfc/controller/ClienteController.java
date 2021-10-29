package com.veiculos.cfc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.veiculos.cfc.model.Cliente;
import com.veiculos.cfc.repository.ClienteRepository;



@RestController
@RequestMapping("/Clientes")

public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler (IllegalArgumentException.class)
	public String handException (IllegalArgumentException ex ) {
		return ex.getMessage();
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	}
			
	

