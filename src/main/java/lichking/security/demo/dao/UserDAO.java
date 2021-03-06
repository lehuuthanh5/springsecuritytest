package lichking.security.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lichking.security.demo.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
}
