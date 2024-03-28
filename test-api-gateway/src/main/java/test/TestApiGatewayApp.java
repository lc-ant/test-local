package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import net.lecousin.ant.apigateway.auth.v1.ApiAuthV1Configuration;
import net.lecousin.ant.apigateway.events.v1.ApiDataEventsV1Configuration;
import net.lecousin.ant.apigateway.tenant.v1.ApiTenantV1Configuration;

@SpringBootApplication
@Import({
	ApiAuthV1Configuration.class,
	ApiDataEventsV1Configuration.class,
	ApiTenantV1Configuration.class,
})
public class TestApiGatewayApp {

	public static void main(String[] args) {
		SpringApplication.run(TestApiGatewayApp.class, args);
	}
	
}
