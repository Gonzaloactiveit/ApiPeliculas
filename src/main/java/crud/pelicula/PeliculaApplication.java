package crud.pelicula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



/*@SpringBootApplication
@Configuration
@PropertySource("classpath:properties/api-locales-canonico.properties")
//@PropertySource("file:${catalina.base}/conf/api-locales-canonico.properties")

public class LocalesApplication extends SpringBootServletInitializer {
	public static void main( String[] args ) {
		SpringApplication.run(LocalesApplication.class, args);
    }
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LocalesApplication.class);
	}
}*/

@SpringBootApplication
public class PeliculaApplication extends SpringBootServletInitializer {
	public static void main( String[] args ) {
		SpringApplication.run(PeliculaApplication.class, args);
    }
	
	
}
