package com.firstapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApplication_Controller {

    @GetMapping("url")
    public String msgHandler() {
        return" SuccessFully Done ";
    }
}
//   localhost:8080/url
