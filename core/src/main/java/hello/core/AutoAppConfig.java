package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (  //@component 붙은애들 다 찾아서 spring bean으로 등록해줌
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =  Configuration.class) // AppConfig와중복되면 안되니 빼주는것
)
public class AutoAppConfig {
}
