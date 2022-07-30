package com.humana.dhp.dhppocs;

import com.humana.dhp.dhppocs.SimpleSpringBootProject.GameRunner;
import com.humana.dhp.dhppocs.SimpleSpringBootProject.MarioGame;
import com.humana.dhp.dhppocs.WebService.MathCal;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DhpPocsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DhpPocsApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.marioGameRunner();// method call

	}

}
