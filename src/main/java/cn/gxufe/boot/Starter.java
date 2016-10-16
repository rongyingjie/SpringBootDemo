package cn.gxufe.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 燕赤侠 2016-10-16
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("cn.gxufe.boot")
@SpringBootApplication
@ImportResource("classpath:data-Context.xml")
public class Starter extends WebMvcConfigurerAdapter {


    public static void main(String [] args){
        SpringApplication.run(Starter.class, args);
    }

}
