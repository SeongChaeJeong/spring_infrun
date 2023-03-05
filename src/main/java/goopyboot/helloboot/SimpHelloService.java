package goopyboot.helloboot;

public class SimpHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
