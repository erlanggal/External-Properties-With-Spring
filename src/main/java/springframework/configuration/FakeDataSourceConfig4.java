package springframework.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springframework.service.FakeDataSource;

@Configuration
@Profile("config4")
public class FakeDataSourceConfig4 {

    @Value("${irvi.another_username}")
    private String username;

    @Value("${irvi.another_password}")
    private String password;

    @Bean
    public FakeDataSource createFakeDataSource()
    {
        return new FakeDataSource(this.username, this.password);
    }
}
