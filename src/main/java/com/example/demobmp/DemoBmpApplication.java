package com.example.demobmp;

import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = "classpath:processes/loanApprovalProcess.bpmn")
public class DemoBmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBmpApplication.class, args);
		System.out.println("started");
	}

}
