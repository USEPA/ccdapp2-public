package gov.epa.ccte.api.ccdapp2.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class TestConfig {

    @Bean
    public TestRestTemplate testRestTemplate(){
      return  new TestRestTemplate();
    }

}
