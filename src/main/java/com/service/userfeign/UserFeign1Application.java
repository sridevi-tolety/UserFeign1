package com.service.userfeign;
​
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;​​
​
@SpringBootApplication​
@EnableFeignClients("com.service.userfeign")​
//@EnableEurekaClient​
public class UserFeign1Application {​
​
public static void main(String[] args) {​
SpringApplication.run(UserFeign1Application.class, args);​
}​
​
/* @Bean​
  public RestTemplate restTemplate(RestTemplateBuilder builder) {​
     return builder.build();​
  }​
*/​
}​