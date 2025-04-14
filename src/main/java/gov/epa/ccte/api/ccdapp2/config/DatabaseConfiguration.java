package gov.epa.ccte.api.ccdapp2.config;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("gov.epa.ccte.api.ccdapp2.repository")
@Import(value = MongoAutoConfiguration.class)
@EnableMongoAuditing
// -- we will need to use this with spring security @EnableMongoAuditing
public class DatabaseConfiguration {

}
