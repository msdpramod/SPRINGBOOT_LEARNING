package low_level_design.springboot_learning.DendencyInjection;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@Component
public class cricketCoach implements Coach {
    @Override
    public String tweet() {
        return "I am a cricket coach";
    }
}
