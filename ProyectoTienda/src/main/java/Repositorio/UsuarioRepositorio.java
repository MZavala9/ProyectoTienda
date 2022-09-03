package Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Modelos.Usuarios;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuarios, Integer> {

	
}
