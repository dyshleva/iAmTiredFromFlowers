package ua.edu.ucu.apps.demo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT user FROM AppUser user WHERE user.email = ?1")
    Optional<AppUser> findUserByEmail(String email);
}
