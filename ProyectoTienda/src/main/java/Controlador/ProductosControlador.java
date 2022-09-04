package Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Modelos.Productos;
import Repositorio.ProductoRepositorio;

@RestController
@RequestMapping("/Productos")
public class ProductosControlador {
	
	@Autowired 
	private ProductoRepositorio productoRepo;

	@GetMapping
	public List<Productos> Productos()
	{
		return (List<Productos>) productoRepo.findAll();
	}
	
	@PostMapping
	public void insertarProductos(@RequestBody Productos producto)
	{
		productoRepo.save(producto);
	}

}
