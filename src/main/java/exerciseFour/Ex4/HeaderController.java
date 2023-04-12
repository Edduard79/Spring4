package exerciseFour.Ex4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader("host") String host){

        return "Host Name: " + host;
    }



}
