package springframework.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import springframework.service.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
@Profile({"config1"})
public class FakeDataSourceConfig {

    @Value("${erlangga.username}")
    private String username;

    @Value("${erlangga.password}")
    private String password;

    @Bean
    public FakeDataSource createFakeDataSource()
    {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(this.username);
        fakeDataSource.setPassword(this.password);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
