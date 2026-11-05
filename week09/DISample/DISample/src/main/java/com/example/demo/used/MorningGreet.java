package com.example.demo.used;
import org.springframework.stereotype.Component;

//@Component
public class MorningGreet implements Greet {
    @Override
    public String greeting() {
        return "좋은 아침입니다.";
    }
}

/*
@SpringBootApplication
public class DISampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(DISampleApplication.class, args);
    }
}
 */