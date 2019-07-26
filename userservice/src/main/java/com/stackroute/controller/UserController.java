package com.stackroute.controller;




import com.stackroute.domain.User;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* @RestController = @Controller + @ResponseBody */



@RestController
@RequestMapping
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }


@GetMapping("/")
public ResponseEntity<String> getUser()
{
    return new ResponseEntity<String>("hello", HttpStatus.OK);
}
    @PostMapping("/user")
    public ResponseEntity<?> saveUser (@RequestBody User user) {

        ResponseEntity responseEntity;

        try {
            userService.saveUser(user);
            responseEntity = new ResponseEntity<String> ("Successfully Completed !!!", HttpStatus.CREATED);
        }
        catch (Exception e) {
            responseEntity = new ResponseEntity<String> (e.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @GetMapping ("user")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<List<User>>(userService.getListUser(),HttpStatus.OK);
    }

}