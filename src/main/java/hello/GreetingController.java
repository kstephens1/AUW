package hello;

//Demo URL
//http://127.0.0.1:8080/GetCreditDecision?keith

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hi there, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/GetCreditDecision")
    public AutoUnderwriter AutoUnderwriter(@RequestParam(value="name", defaultValue="World") String name) {
        return new AutoUnderwriter(counter.incrementAndGet(),
                            String.format(template, name));
    }
}