package com.moduretick.springbatchdemo.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class SpringBatchDemoConfig {
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
		
	@Bean
	public Job printHelloJob(Step printHelloStep) {
		return jobBuilderFactory
				.get("printHelloJob")
				.start(printHelloStep)
				.build();
	}
}
