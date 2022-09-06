package com.mnia.course.resources;

import com.mnia.course.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
     User u = new User(1L, "Marcos", "teste@teste.com", "1212121", "1243");
        return ResponseEntity.ok().body(u);
    }
}
