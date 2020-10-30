package edu.miu.cs.cs544.eurekaserver.simpleeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimpleEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleEurekaServerApplication.class, args);
    }

}
