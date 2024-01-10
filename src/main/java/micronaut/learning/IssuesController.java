package micronaut.learning;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/issues") // (1)
public class IssuesController {

    @Get("/{number}") // (2)
    public String issue(@PathVariable Integer number) { // (3)
        return "Issue # " + number + "!"; // (4)
    }
}