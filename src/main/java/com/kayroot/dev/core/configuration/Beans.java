package com.kayroot.dev.core.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kayroot.dev.core.entities.Cliente;

@Configuration
public class Beans {

	@Bean("clientes1")
	public List<Cliente> clientes(){
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("ILLIDAN","illidan@gmail.com"));
		clientes.add(new Cliente("SHADOW","shadow@gmail.com"));
		clientes.add(new Cliente("BARON","baron@gmail.com"));
		return clientes;
	}
	
	@Bean("clientes2")
	public List<Cliente> clientesVIP(){
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("RAMON","ramon@gmail.com"));
		clientes.add(new Cliente("ROMANO","romano@gmail.com"));
		clientes.add(new Cliente("RAMONA","ramona@gmail.com"));
		return clientes;
	}
}
