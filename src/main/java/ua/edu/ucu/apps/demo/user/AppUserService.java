package ua.edu.ucu.apps.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    public AppUserRepository userRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.userRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void add(AppUser user) {
        // userRepository.save(user);
        if (userRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
