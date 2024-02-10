package ru.sf.practicalweek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PracticalWeekApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticalWeekApplication.class, args);
    }

}
