package com.example.demo.dao;

import java.util.List;

import com.example.demo.models.Cliente;

import jakarta.transaction.Transactional;

@Transactional
public interface ClienteDao {

	List<Cliente> obtenerCliente();
}
