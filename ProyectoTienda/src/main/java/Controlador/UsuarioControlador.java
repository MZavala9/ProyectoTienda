package Controlador;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public void insertar(@RequestBody Modelos.Usuarios usuario)
	{
		usuarioRepositorio.save(usuario);
	}
	@PutMapping
	public void modificar(@RequestBody Modelos.Usuarios usuario)
	{
		usuarioRepositorio.save(usuario);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		usuarioRepositorio.deleteById(id);
	}
}
