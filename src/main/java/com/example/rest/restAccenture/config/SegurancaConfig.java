package com.example.rest.restAccenture.config;

import javax.annotation.Resource.AuthenticationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.rest.restAccenture.model.Usuario;
import com.example.rest.restAccenture.service.UsuarioService;

@Repository
public class SegurancaConfig {//implements UserDetailsService

	@Autowired
	private UsuarioService userService;
	
	
	//@Override
	/*public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		/*Usuario loginUsuario = userService.findByLogin(login);
		
		if(loginUsuario ==null) {
			
			throw new UsernameNotFoundException("Login não encontrado");
			
		}		
		return loginUsuario ;*/
	//}


	
}
