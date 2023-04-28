package pl.niziolekp.jenkinsspringheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringHerokuApplication.class, args);
	}
	@GetMapping
	public String get(){
		return "Hello(simple project Docker+Jenkins+Junit)";
	}
}
