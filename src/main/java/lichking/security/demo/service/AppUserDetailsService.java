package lichking.security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lichking.security.demo.dao.UserDAO;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) {
		return new AppUserPrincipal(
				userDAO.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username)));
	}

}
