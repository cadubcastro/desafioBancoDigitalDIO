package br.com.cadubcastro.bancoDigital.cliente;

import lombok.Getter;

@Getter
public class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
}