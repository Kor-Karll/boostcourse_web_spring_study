package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.or.coonect.diexam01")
public class ApplicationConfig2 {
    @Bean
    public Car car(Engine e) {
        Car c = new Car();
        return c;
    }

    @Bean
    public Engine engine() {
        return new Engine();
    }
}
