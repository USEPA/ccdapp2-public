package gov.epa.ccte.api.ccdapp2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@Configuration
public class ConfigureRepositoriesPopulator {

/*    @Bean
    @Profile({"with-data"})
    public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulatorForChemicalList(ChemicalListRepository chemicalListRepository) {

        //sequenceGeneratorService.resetSequence("compound_sequence", 0);

        chemicalListRepository.deleteAll();

        Resource chemicalListTestData = new ClassPathResource("chemicallist-test-data.json");

        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[]{chemicalListTestData});

        return factory;
    }

    @Bean
    @Profile({"with-data"})
    public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulatorForChemicalListDetails(ListlDetailRepository chemicalDetailRepository) {

        //sequenceGeneratorService.resetSequence("compound_sequence", 0);

        chemicalDetailRepository.deleteAll();

        Resource chemicalListTestData = new ClassPathResource("chemicalList-details-test-data.json");

        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[]{chemicalListTestData});

        return factory;
    }*/
}
