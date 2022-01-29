package com.kayroot.dev.core.repository;

import java.util.List;
import java.util.Optional;

import com.kayroot.dev.core.entities.Cliente;


public interface IRepositorio {

	List<Cliente> listarClientes();
	
	void conectar();	
	
}
