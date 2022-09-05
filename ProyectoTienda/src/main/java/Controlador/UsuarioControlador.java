package Controlador;

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
import org.springframework.ui.Model;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioControlador {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@GetMapping("")
	public String viewHomePage()
	{
		return "index";
	}
	
	@GetMapping("/Registro")
	public String Regsitro(Model modelo)
	{
		modelo.addAttribute("Usuarios", new Modelos.Usuarios());
		return "Formulario_Registro";
	}

	@PostMapping("/Proceso_Registro")
	public String insertarRegistro(Modelos.Usuarios usuario)
	{
		usuarioRepositorio.save(usuario);

		return "Registro Exitoso";
	}
	
	@GetMapping()
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
	
}
