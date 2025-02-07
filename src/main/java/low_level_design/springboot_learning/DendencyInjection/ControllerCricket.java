package low_level_design.springboot_learning.DendencyInjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCricket {
    private Coach coach;

    public ControllerCricket(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/tweet")
    public String tweet(String coachName) {
        return coach.tweet();
    }
}
