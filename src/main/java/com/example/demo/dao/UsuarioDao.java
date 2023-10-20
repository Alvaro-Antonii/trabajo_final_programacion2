package com.example.demo.dao;

import java.util.List;

import com.example.demo.models.Usuario;

import jakarta.transaction.Transactional;
@Transactional
public interface UsuarioDao {
	
	

	List<Usuario>  getUsuarios(); //cambie obtenerUsuarios por getUsuarios

	void eliminar(Long id);
	void registrar(Usuario usuario);
	boolean verificarCredenciales(Usuario usuario);
}
