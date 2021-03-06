package com.Hopper.RedeHopper.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hopper.RedeHopper.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	List<Usuario> findAllByEmailContainingIgnoreCase(String email);
	

}
