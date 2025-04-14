package gov.epa.ccte.api.ccdapp2.integration.executivesummary;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ExecutiveSummaryPodIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Value("${application.server-port}")
    private int port;



    @Test
    public void returnExecutiveSummaryPodWithHttpStatusCode200() throws Throwable {

        try {

            ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:" + port +"/executive-summary-pod", String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(200, result.getStatusCodeValue());
            Assert.assertEquals(HttpStatus.OK, result.getStatusCode());

        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void returnExecutiveSummaryPodWithHttpStatusCode404() throws Throwable {
        try {
            ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:" + port +"/124", String.class);
            log.debug("{} is random port ", port);
            Assert.assertEquals(404, result.getStatusCodeValue());
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void returnExecutiveSummaryPodByDtxsidWithHttpStatusCode200() throws Throwable {
        try {
            ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:" + port +"/executive-summary-pod/search/by-dtxsid?id=DTXSID7020182", String.class);
            System.out.println(port);
            log.debug("{} is random port ", port);
            Assert.assertEquals(200, result.getStatusCodeValue());
            Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }

    }

}

