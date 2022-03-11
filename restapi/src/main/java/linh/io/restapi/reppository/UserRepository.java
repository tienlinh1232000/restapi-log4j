package linh.io.restapi.reppository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import linh.io.restapi.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String q);
} 