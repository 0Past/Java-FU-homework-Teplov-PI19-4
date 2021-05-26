package com.blog.blog.Controller;

import com.blog.blog.Service.UserService;
import com.blog.blog.entity.EnterEntity;
import com.blog.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EnterController {
    private final UserService userService;

    @Autowired
    public EnterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/enter")
    public ResponseEntity<?> entUser(@RequestBody EnterEntity enterEntity) {

        String result = userService.entUser(enterEntity);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }


    @PostMapping("/registration")
    public ResponseEntity<?> regUser(@RequestBody User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
