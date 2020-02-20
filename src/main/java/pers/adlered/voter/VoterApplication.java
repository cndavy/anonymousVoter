package pers.adlered.voter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "pers.adlered.voter.service" )
public class VoterApplication {


    public static void main(String[] args) {
        SpringApplication.run(VoterApplication.class, args);
    }
}
