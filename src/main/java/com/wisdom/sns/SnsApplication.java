package com.wisdom.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//초반 DB 연결 시도 시 에러 발생. exclude 해주면 시도하지 않음
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnsApplication.class, args);
    }

}
