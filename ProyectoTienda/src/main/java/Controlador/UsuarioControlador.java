package Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repositorio.UsuarioRepositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioControlador {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@GetMapping
	public List<Modelos.Usuarios> Usuarios()
	{
		return (List<Modelos.Usuarios>) usuarioRepositorio.findAll();
	}
}
