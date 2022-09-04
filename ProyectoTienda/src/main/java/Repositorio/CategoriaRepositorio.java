package Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Modelos.Categoria;

@Repository
public interface CategoriaRepositorio extends CrudRepository<Categoria, Integer> {

}
