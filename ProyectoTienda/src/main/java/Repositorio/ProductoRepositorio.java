package Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Modelos.Productos;

@Repository
public interface ProductoRepositorio extends CrudRepository<Productos, Integer> {

}
