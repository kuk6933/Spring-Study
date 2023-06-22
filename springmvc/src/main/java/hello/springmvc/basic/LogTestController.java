package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller view 이름이 반환됨
@Slf4j
@RestController //string  그대로 반환됨
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass()); //class 지정 근데 롬복 쓰면 해결 ㅋ

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace my log = " + name); //이렇게 쓰면 + 연산이 되기 때문에 낭비임

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
