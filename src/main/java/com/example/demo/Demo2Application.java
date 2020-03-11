package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//@SpringBootApplication
//public class Demo2Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Demo2Application.class, args);
//	}
//
//}



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.transaction.annotation.EnableTransactionManagement;





@SpringBootApplication

@EnableTransactionManagement//开启事务管理

public class Demo2Application {

public static void main(String[] args) {

SpringApplication.run(Demo2Application.class, args);

}

}

