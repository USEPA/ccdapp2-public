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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@Slf4j
@ActiveProfiles("stg-epa")
public class AssayListIntegrationTest {

    @Autowired
    private  TestRestTemplate testRestTemplate ;

    @Value("${application.server-port}")
    private int port;

    @Value("${spring.data.rest.base-path}")
    private String path;


    @Test
    public void returnAssayListsWithHttpStatusCode200() throws Throwable {
       try{
        ResponseEntity<String> result= testRestTemplate.getForEntity("http://localhost:"+port+"/assay-lists",  String.class);
           log.debug("{} is random port ", port);
           Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
       } catch (HttpClientErrorException e) {
           e.printStackTrace();
       }

    }

    @Test
    public void returnAssayListsWithHttpStatusCode404() throws Throwable {
       try{
        ResponseEntity<String> result= testRestTemplate.getForEntity("http://localhost:"+port+"/assaylists124",  String.class);
           log.debug("{} is random port ", port);
           Assert.assertEquals(404, result.getStatusCodeValue());
       } catch (HttpClientErrorException e) {
           e.printStackTrace();
       }

    }

    @Test
    public void returnAssayListsByNameWithHttpStatusCode200()  throws Throwable{
        try{
        ResponseEntity<String> result= testRestTemplate.getForEntity("http://localhost:"+port+"/assay-lists/search/by-name?name=ACEA_ER_80hr",  String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }

    }

    @Test
    @DisplayName("Assay list name not found returning empty array")
    public void returnAssayListsByNameWithHttpStatusCode202() throws Throwable {
        try{
        ResponseEntity<String> result= testRestTemplate.getForEntity("http://localhost:"+port+"/assay-lists/search/by-name?name=XYZ",  String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(202, result.getStatusCodeValue());
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
    }
}
