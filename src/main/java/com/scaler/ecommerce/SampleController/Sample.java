package com.scaler.ecommerce.SampleController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class Sample {

    @GetMapping("/{id}")
    public String hello(@PathVariable("id") int id) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < id; i++) {
            sb.append("Hello wordld");
        }
        return sb.toString();

    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Bye World";
    }
}
