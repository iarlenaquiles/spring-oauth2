package com.oauth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MeuUserDetailsService implements UserDetailsService {

	@Autowired
	//private UsuarioRepository usuarioRepository;

	//@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//Usuario usuario = usuarioRepository.findByEmail(username);
		
//		if (usuario == null) {
//			throw new UsernameNotFoundException("Usuário ou senha inválidos");
//		}
//		
		//return new MyUserDetails(usuario);
		return null;
	}

}
