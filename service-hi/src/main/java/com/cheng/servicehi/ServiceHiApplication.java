package com.cheng.servicehi;

import com.cheng.rabbitmq.HelloSender1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@ComponentScan("com")
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

  /*  @Value("${foo}")
    String foo;
    @RequestMapping("hi")
    public String hi(String name){
        return name+"service-hi=="+foo;
    }*/
  @Autowired
  private HelloSender1 helloSender1;
  @RequestMapping("rabbitHi")
  public String rabbitHi(String name){
      helloSender1.send(name);
      return null;
  }
}
