package gov.epa.ccte.api.ccdapp2.integration;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@Slf4j
@ActiveProfiles("stg-epa")
public class AssayEndpointDetailIntegrationTest {


    @Autowired
    private TestRestTemplate testRestTemplate;

    @Value("${application.server-port}")
    private int port;

    @Value("${spring.data.rest.base-path}")
    private String path;


    @Test
    public void returnAssayEndpointDetailWithHttpStatusCode200() throws Throwable {

        try {

            ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:"+port+path+"/assay-endpoint-detail", String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(200, result.getStatusCodeValue());
            Assert.assertEquals(HttpStatus.OK, result.getStatusCode());

        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void returnAssayEndpointDetailWithHttpStatusCode404() throws Throwable {
        try {
            ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:"+port+path+"/124", String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(404, result.getStatusCodeValue());
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void returnAssayEndpointDetailByNameWithHttpStatusCode200() throws Throwable {
        try {
            ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:"+port+path+"/assay-endpoint-detail/search/by-endpointname?name=ACEA_ER_80hr", String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(200, result.getStatusCodeValue());
            Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }

    }

}
