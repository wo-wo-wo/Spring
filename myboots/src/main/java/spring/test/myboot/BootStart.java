package spring.test.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages={"spring.test.myboot.*","spring.test.myboot.service.impl","spring.test.myboot.controller"})
public class BootStart {
    private static final Logger logger = LoggerFactory.getLogger(BootStart.class);


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(BootStart.class);
    }

}
