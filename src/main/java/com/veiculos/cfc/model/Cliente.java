package com.veiculos.cfc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(nullable = false)
	private Long id;
    private String nome;
	private String nascimento;
	
	
	@Column(unique=true)
	private String cpf;
	private String email;

	
	}




