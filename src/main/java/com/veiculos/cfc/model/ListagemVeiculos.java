package com.veiculos.cfc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ListagemVeiculos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	


    private String Veiculo_Nr;
	private String Cliente;
	private String Tipo_Veiculo;
	private String Marca;
	private String Modelo;


	
	}



