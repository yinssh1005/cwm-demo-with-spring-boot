package c.d.w.s.b.cwmdemowithspringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FooController {

    @GetMapping("/greeting")
    public String index() {
        return "Greetings from Spring boot service!";
    }
}