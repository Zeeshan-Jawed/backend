package uni.project.ecommerce.Service.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uni.project.ecommerce.Model.AppUser;
import uni.project.ecommerce.Repository.AppUserRepository;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      AppUser appUser= appUserRepository.findByEmail(email);
        return new User(appUser.getEmail(),appUser.getPassword(),new ArrayList<>());

    }
}
