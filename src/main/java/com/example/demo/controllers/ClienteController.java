package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ClienteDao;
import com.example.demo.models.Cliente;
@RestController
public class ClienteController {
	
	@Autowired
	private ClienteDao clienteDao;
	
	@RequestMapping(value="api/cliente")
	public List<Cliente> listarClientes(){
		
		List<Cliente> usuarios = clienteDao.obtenerCliente();
		
		return usuarios;
	}


	
}
