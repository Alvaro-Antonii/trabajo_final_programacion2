package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Cliente;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional

public class ClienteDaoImple implements ClienteDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Cliente> obtenerCliente() {
		String query = "from Cliente";
		List<Cliente> resultado = entityManager.createQuery(query).getResultList();
		return resultado;
	}

}
