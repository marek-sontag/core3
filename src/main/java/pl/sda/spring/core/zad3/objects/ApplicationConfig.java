package pl.sda.spring.core.zad3.objects;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {

    @Bean
    public Worker mechanic() {
        Worker worker = new Worker();
        worker.setProffession("mechanic");
        worker.setAge(20);
        return worker;
    }

    @Bean
    public Tool hummer() {
        return new Tool(5, "Młoteczek");
    }
}
