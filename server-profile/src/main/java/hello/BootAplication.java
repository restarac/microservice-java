package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// The annotation above is an convenience for:
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@EnableWebMvc
public class BootAplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootAplication.class, args);
	}
}
