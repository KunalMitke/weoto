package Welcome;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Welcome {

    @GetMapping("Welcome")
    public String welcome()
    {
        return "Welcome To Spring Boot";
    }
}
