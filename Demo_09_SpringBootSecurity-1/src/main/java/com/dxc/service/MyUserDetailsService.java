package com.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dxc.model.User;
import com.dxc.model.Userprincipal;
import com.dxc.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("Username not found");
		}
		return new Userprincipal(user);
	}

}
