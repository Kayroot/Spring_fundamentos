package com.kayroot.dev.core.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.kayroot.dev.core.entities.Cliente;
import com.kayroot.dev.core.repository.IRepositorio;

@Repository

public class RepoOracle implements IRepositorio {

	List<Cliente> listaClientes;
	
	@Autowired
	public RepoOracle(@Qualifier("clientes1") List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public List<Cliente> listarClientes() {		
		return listaClientes;
	}

	@Override
	public void conectar() {
		System.out.println("Conectandonos a ORACLE...");		
	}
}
