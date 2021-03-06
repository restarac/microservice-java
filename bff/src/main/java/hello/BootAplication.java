package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

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
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
