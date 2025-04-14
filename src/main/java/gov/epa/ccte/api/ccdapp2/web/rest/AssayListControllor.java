package gov.epa.ccte.api.ccdapp2.web.rest;

import gov.epa.ccte.api.ccdapp2.domain.assaylist.AssayDetailShort;
import gov.epa.ccte.api.ccdapp2.repository.assaylist.AssayEndpointDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AssayListControllor {

    private final AssayEndpointDetailRepository assayEndpointDetailRepository;

    public AssayListControllor(AssayEndpointDetailRepository assayEndpointDetailRepository) {
        this.assayEndpointDetailRepository = assayEndpointDetailRepository;
    }


    @GetMapping("/assaydetail-by-endpoint-name")
    public List<AssayDetailShort> getConcResponse1(@RequestBody List<String> assayComponentEndpointNames) {
        return assayEndpointDetailRepository.findAllByAssayComponentEndpointNameIn(assayComponentEndpointNames);
    }
}
