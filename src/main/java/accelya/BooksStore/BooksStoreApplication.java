package accelya.BooksStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "controller" })
@EntityScan({"model"})
@EnableJpaRepositories({"repository"})
public class BooksStoreApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(BooksStoreApplication.class, args);
	}

}