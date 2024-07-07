package app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/greeting")
    public Response greeting() {
        return new Response("Hello, World!");
    }

    @PostMapping("/api/greeting")
    public Response personalizedGreeting(@RequestBody UserRequest userRequest) {
        return new Response("Hello, " + userRequest.getName() + "!");
    }
}
