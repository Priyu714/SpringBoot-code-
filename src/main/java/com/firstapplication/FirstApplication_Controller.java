package com.firstapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApplication_Controller {

    @GetMapping("url")
    public String msgHandler() {
        return" SuccessFully Done ";
    }
    @GetMapping("url123")
    public String error() {
        return" Error Found  ";
    }

    @GetMapping("ur1/{id}")
    public String urlChecker(@PathVariable int id ) {
        return" URL Added " +id +" Id is added successfully";
    }
}
//   localhost:8080/url
