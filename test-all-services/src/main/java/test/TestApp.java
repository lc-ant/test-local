package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import net.lecousin.ant.service.provider.jobcontrol.JobControlServiceConfiguration;
import net.lecousin.ant.service.provider.security.SecurityServiceConfiguration;
import net.lecousin.ant.service.provider.tenant.TenantServiceConfiguration;
import net.lecousin.ant.service.provider.user.UserServiceConfiguration;

@SpringBootApplication
@Import({
	JobControlServiceConfiguration.class,
	SecurityServiceConfiguration.class,
	TenantServiceConfiguration.class,
	UserServiceConfiguration.class
})
public class TestApp {

	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
	
}
