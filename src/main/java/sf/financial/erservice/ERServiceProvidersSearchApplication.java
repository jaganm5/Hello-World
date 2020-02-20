package sf.financial.erservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ERServiceProvidersSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ERServiceProvidersSearchApplication.class, args);
	}
	
	/*
	 * public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	 * return builder.sources(Application.class); }
	 */
}
