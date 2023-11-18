package com.gunnerapps.testrunserver;

import com.gunnerapps.testrunserver.service.RunFromServerService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RunFromServerApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(RunFromServerApplication.class, args);
		RunFromServerService rfss = ac.getBean(RunFromServerService.class);
		rfss.printMessageOnScreen();
	}

}
