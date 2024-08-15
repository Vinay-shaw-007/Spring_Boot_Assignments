package com.example.vinay.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

//	@Autowired
//	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		cakeBaker.bakeCake();
	}
}
