package com.staxrt.tutorial.springbootrestapitutorial;

import com.staxrt.tutorial.springbootrestapitutorial.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import javax.validation.Valid;

@RestController

@RequestMapping("/api/v1")

public class UserController {

  @Autowired

  private UserRepository userRepository;
  /*public List<Book> list() {
        return bookRepository.findAll();
    }*/

  

  @GetMapping("/users")
  

  public List<User> getAllUsers() {

    return userRepository.findAll();

  }

  /**

   * Gets users by id.

   *

   * @param userId the user id

   * @return the users by id

   * @throws ResourceNotFoundException the resource not found exception

   */

  @GetMapping("/users/{id}")

  public ResponseEntity<Optional<User>> getUsersById(@PathVariable(value = "id") Long userId)
{

    Optional<User> user = userRepository.findById(userId);

    return ResponseEntity.ok().body(user);

  }

  

  
  
  @PostMapping(path = "/users", consumes = "application/json")

  public User createUser(@RequestBody User user) {

    return userRepository.save(user);

  }

  
  @PutMapping(path = "/users/{id}", consumes = "application/json")

  public ResponseEntity<User> updateUser(

      @PathVariable(value = "id") Long userId, @RequestBody User userDetails)

      { 

    Optional<User> user = userRepository.findById(userId);

    final User updatedUser = userRepository.save(user);

    return ResponseEntity.ok(updatedUser);

  }

  

  @DeleteMapping(path = "/user/{id}", consumes = "application/json")

  public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) {

    Optional<User> user = userRepository.findById(userId);

    userRepository.deleteById(user);

    Map<String, Boolean> response = new HashMap<>();

    response.put("deleted", Boolean.TRUE);

    return response;

  }

}
