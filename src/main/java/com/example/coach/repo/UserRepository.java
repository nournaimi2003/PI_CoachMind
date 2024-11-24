package com.example.coach.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.coach.entity.Categorie;
import com.example.coach.entity.User;

@RepositoryRestResource(path = "rest")
/*http://localhost:8081/rest*/
public interface UserRepository extends JpaRepository<User, Long> {
	List<User>findByUsername(String username);
	@Query("select u from User u where u.categorie = ?1")
	List<User> findByCategorie (Categorie categorie);
	List<User> findByCategorieIdCategorie(Long id);
	Optional<User> findByEmail(String email); // Recherche par email

}
