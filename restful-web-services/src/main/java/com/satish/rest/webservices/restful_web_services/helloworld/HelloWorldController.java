package com.satish.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloworld() {
        return "Hello world";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloworldBean() {
        return new HelloWorldBean("Hello world");
    }

    // Path variable
    // eg-/users/{id}//todos/{is} => /user/2/todos/312
    // /hello-world/path-variable/{name}
    // /hello-world/path-variable/Satish
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloworldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }

}
