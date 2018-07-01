package org.lilacseeking.common.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
    @RequestMapping(value = "/exam")
    public String example() {
        return "aaa";
    }
}
