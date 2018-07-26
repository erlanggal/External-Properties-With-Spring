package springframework.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import springframework.service.FakeDataSource;

@Configuration
@PropertySource("classpath:jms.properties")
@Profile("config2")
public class FakeDataSourceConfig2 {

    @Value("${laimena.username}")
    private String username;

    @Value("${laimena.password}")
    private String password;

    @Bean
    public FakeDataSource createFakeDataSource()
    {
        return new FakeDataSource(this.username, this.password);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
