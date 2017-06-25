package springboot.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springboot.topic.Topic;

@SpringBootApplication
@ComponentScan(basePackages = "springboot")
@EnableJpaRepositories("springboot")
@EnableAutoConfiguration
@EntityScan(basePackageClasses=Topic.class)
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);

	}

}
