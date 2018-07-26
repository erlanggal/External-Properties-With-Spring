package springframework.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springframework.service.FakeDataSource;

@Configuration
@Profile({"default","config3"})
public class FakeDataSourceConfig3 {

    @Value("${irvi.username}")
    private String username;

    @Value("${irvi.password}")
    private String password;

    @Bean
    public FakeDataSource createFakeDataSource()
    {
        return new FakeDataSource(this.username, this.password);
    }
}
