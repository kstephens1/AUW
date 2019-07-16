package AutoUnderwriter;

//Demo URL
//http://127.0.0.1:8080/GetCreditDecision?name=param

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Dummy %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/GetCreditDecision")
    public AutoUnderwriter AutoUnderwriter(@RequestParam(value="name", defaultValue="Response") String name) {
        return new AutoUnderwriter(counter.incrementAndGet(),
                            String.format(template, name));
    }
}