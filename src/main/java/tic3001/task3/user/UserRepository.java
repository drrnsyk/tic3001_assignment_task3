package tic3001.task3.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    // email is the username, which is the unique field
    Optional<User> findByEmail(String email);

}
