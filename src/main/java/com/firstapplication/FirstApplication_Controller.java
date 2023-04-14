package com.firstapplication;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("url")
    public String urlChecker() {
        return" URL Added ";
    }
}
//   localhost:8080/url
