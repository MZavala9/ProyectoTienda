package Clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import Modelos.Usuarios;
import Repositorio.UsuarioRepositorio;

public class UsuarioDetallesClienteServico implements UserDetailsService {

	@Autowired
	private UsuarioRepositorio repo;
	
	@Override
	public UserDetails loadUserByUsername(String Correo) throws UsernameNotFoundException {
		Usuarios usuario = repo.findByEmail(Correo);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario no Encontrado");
		}
		
		return new UsuarioDetallesCliente(usuario);
	}

}
