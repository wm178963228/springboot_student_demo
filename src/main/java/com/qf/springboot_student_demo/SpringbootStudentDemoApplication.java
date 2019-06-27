package com.qf.springboot_student_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringbootStudentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentDemoApplication.class, args);
	}

}
