package com.kayroot.dev.core.repository.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.kayroot.dev.core.entities.Cliente;
import com.kayroot.dev.core.repository.IRepositorio;

@Repository
@Primary
public class RepoMySQL implements IRepositorio{

	@Autowired
	@Qualifier("clientes2")
	List<Cliente> listaClientes;
	
	@Override
	public List<Cliente> listarClientes() {		
		return listaClientes;
	}

	@Override
	public void conectar() {
		System.out.println("Conectandonos a MYSQL...");		
	}

}
