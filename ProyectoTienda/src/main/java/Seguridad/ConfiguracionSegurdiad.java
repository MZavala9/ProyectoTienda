package Seguridad;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import Clientes.UsuarioDetallesClienteServico;


@Configuration
@EnableWebSecurity
public class ConfiguracionSegurdiad extends WebSecurityConfiguration {

    @Autowired
    private DataSource dataSource;

    @Bean
    public UserDetailsService UsuarioDetallesservicio(){
        return new UsuarioDetallesClienteServico();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider()
    {
        DaoAuthenticationProvider autenticacion = new DaoAuthenticationProvider();
        autenticacion.setUserDetailsService(UsuarioDetallesservicio());
        autenticacion.setPasswordEncoder(passwordEncoder());

        return autenticacion;
    }

    
}
