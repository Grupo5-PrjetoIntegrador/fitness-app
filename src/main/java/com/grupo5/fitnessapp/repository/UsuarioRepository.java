package com.grupo5.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo5.fitnessapp.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
