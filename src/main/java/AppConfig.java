import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.services.IServiceCall;
import com.services.NBAStars;

@Configuration
@ComponentScan("com.services")
public class AppConfig {
	
	@Bean
	public IServiceCall getIServiceCallBean()
	{
		return new NBAStars();
	}
}
