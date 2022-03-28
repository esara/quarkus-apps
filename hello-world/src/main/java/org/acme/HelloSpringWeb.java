package org.acme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/bello")
public class HelloSpringWeb {

    @GetMapping(produces = "text/plan")
    public String hello() {
        return "Bello SpringWeb";
    }
}