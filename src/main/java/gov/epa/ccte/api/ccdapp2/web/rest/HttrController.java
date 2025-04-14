package gov.epa.ccte.api.ccdapp2.web.rest;

import gov.epa.ccte.api.ccdapp2.domain.httr.Citations;
import gov.epa.ccte.api.ccdapp2.domain.httr.Httr;
import gov.epa.ccte.api.ccdapp2.domain.httr.HttrCitations;
import gov.epa.ccte.api.ccdapp2.repository.httr.HttrCitationsRepository;
import gov.epa.ccte.api.ccdapp2.repository.httr.HttrRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@CrossOrigin
public class HttrController {

    private final HttrRepository httrRepository;

    private final HttrCitationsRepository httrCitationsRepository;


    public HttrController(HttrRepository httrRepository, HttrCitationsRepository httrCitationsRepository) {
        this.httrRepository = httrRepository;
        this.httrCitationsRepository = httrCitationsRepository;
    }


    @GetMapping("/httr-conc-response")
    public List<Httr> getConcResponse(@Param("cellType") String cellType, @Param("signature") String signature,
                                      @Param("sampleId") String sampleId, @Param("dataset") String dataset) {
        return httrRepository.findByCellTypeAndSignatureAndSampleIdAndDataset(cellType, signature, sampleId, dataset);
    }

    @GetMapping("/check-httr-info")
    public int checkHttrInfo(@Param("dtxsid") String dtxsid) {
        int result = 0;
        List<Httr> httrList = httrRepository.findBydtxsid(dtxsid);
        if (!(httrList.isEmpty())) {
            result = 1;
        }
        return result;
    }

}
