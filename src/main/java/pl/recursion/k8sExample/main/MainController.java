package pl.recursion.k8sExample.main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(path = "/test")
    public String get() {
        return "OK";
    }

}
