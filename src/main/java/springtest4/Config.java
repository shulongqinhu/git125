package springtest4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//@PropertySource(value = "classpath:db.properties")
@PropertySource(value = "file:C:\\Users\\86132\\IdeaProjects\\userSys\\git125\\src\\main\\resources\\db.properties")
public class Config {

}
