package PetrikDev.ProjectTree.Service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    // Itt helyezzük el a felhasználók adatait (egyszerű példa memóriában tároláshoz)
    private Map<String, UserDetails> users = new HashMap<>();

    public JwtUserDetailsService() {
        // Például itt helyezzük el néhány felhasználói adatot
        // Ez csak egy példa, nem használjuk ezt a megoldást valós alkalmazásban!
        users.put("john_doe", new User("john_doe", "password", List.of(new SimpleGrantedAuthority("ROLE_USER"))));
        users.put("admin", new User("admin", "admin_password", List.of(new SimpleGrantedAuthority("ROLE_ADMIN"))));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Itt ellenőrizzük, hogy az adott felhasználó létezik-e a listában
        if (!users.containsKey(username)) {
            throw new UsernameNotFoundException("Felhasználó nem található: " + username);
        }

        // Visszaadjuk a felhasználói adatokat
        return users.get(username);
    }
}

