package it.nextre.academy.realspring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("it.nextre.academy.realspring")
@EnableWebMvc
@Import({ SecurityConfigs.class })
public class AppConfig {
}//end class
