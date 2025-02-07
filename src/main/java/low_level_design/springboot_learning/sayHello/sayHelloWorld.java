package low_level_design.springboot_learning.sayHello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class sayHelloWorld {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!  "+coachName;
    }

    @Value("${coach.name}")
    private String coachName;
}
