package com.wt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.wt.mapper")
public class WthyfunApplication {

	public static void main(String[] args) {
		SpringApplication.run(WthyfunApplication.class, args);
	}


}
