package com.Sravan.rest.webservices.restful_web_services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld(){
    return "Hello World";
    }
}
