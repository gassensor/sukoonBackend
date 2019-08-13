package com.staxrt.tutorial.springbootrestapitutorial;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

	User save(Optional<User> user);

	void deleteById(Optional<User> user);}