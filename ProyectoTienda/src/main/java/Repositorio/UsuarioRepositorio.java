package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Modelos.Usuarios;

@Repository
//public interface UsuarioRepositorio extends CrudRepository<Usuarios, Integer> {}

public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long>{
	@Query("select * from tbl_Usuarios u  where u.Usu_email = ?1")
	Usuarios findByEmail(String correo);
}
