package cc.before30.homeex.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author before30
 * @since 2020/03/07
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "world";
    }
}
