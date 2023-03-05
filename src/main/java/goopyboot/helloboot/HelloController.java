package goopyboot.helloboot;

import java.util.Objects;

public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    String hello(String name){
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
