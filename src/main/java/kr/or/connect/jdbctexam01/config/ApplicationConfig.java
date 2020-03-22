package kr.or.connect.jdbctexam01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.or.connect.dao"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
