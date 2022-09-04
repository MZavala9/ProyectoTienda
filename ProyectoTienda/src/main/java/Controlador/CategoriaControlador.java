package Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Modelos.Categoria;
import Repositorio.CategoriaRepositorio;

@RestController
@RequestMapping("/Categorias")
public class CategoriaControlador {
	
	@Autowired 
	private CategoriaRepositorio categoriaRepo;

	@GetMapping
	public List<Categoria> Categorias()
	{
		return (List<Categoria>) categoriaRepo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Categoria categoria)
	{
		categoriaRepo.save(categoria);
	}
}
