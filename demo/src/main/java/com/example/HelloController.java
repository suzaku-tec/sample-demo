package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.GET)
    public Hoge hello(@RequestBody Hoge param) {
    	System.out.println("test");
        System.out.println(param);

        Hoge hoge = new Hoge();
        hoge.id = 20;
        hoge.value = "Response";

        return hoge;
    }
}
