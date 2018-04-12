package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "buyer.domain", "ticket.domain" })
@EnableJpaRepositories(basePackages = { "buyer.repository", "ticket.repository" })
@ComponentScan({"buyer","ticket"})
@EnableAspectJAutoProxy()
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}