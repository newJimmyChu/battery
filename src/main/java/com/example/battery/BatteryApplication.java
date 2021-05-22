package com.example.battery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.battery.core.mapper")
@SpringBootApplication
public class BatteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatteryApplication.class, args);
    }

}
