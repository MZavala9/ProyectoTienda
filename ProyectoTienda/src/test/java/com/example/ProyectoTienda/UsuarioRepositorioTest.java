package com.example.ProyectoTienda;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import Modelos.Usuarios;
import Repositorio.UsuarioRepositorio;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UsuarioRepositorioTest {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCrearUsuario() {
		Usuarios usuario = new Usuarios();
		usuario.setUsu_email("joseh71@gmail.com");
		usuario.setUsu_nombre("jose Herrera");
		usuario.setUsu_pass("1234");
		
		Usuarios guardarUusario=repositorio.save(usuario);
		
		Usuarios existeUsuario = entityManager.find(Usuarios.class, guardarUusario.getUsu_id());
		
		assertThat(existeUsuario.getUsu_email()).isEqualTo(usuario.getUsu_email());
	}
	
	@Test
	public void testEncontrarUsuarioxCorreo() {
		String correo = "joseh71@gmail.com";
		
		Usuarios usuario = repositorio.findByEmail(correo);
		
		assertThat(usuario).isNotNull();
	}
	
}
