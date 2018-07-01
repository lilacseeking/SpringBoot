package org.lilacseeking.common.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
    @RequestMapping(value = "/exam4")
    public String example() {
        return "aaa";
    }
    @RequestMapping(value = "exam2")
    public String example2(){
        return "000";
    }
    @RequestMapping(value = "exam3")
    public String exam3(){
        return "333";
    }
}
