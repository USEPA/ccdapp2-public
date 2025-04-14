package gov.epa.ccte.api.ccdapp2.web.rest;

import gov.epa.ccte.api.ccdapp2.domain.htpp.Htpp;
import gov.epa.ccte.api.ccdapp2.repository.htpp.HtppRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
public class HtppController {

    private final HtppRepository htppRepository;

    public HtppController(HtppRepository htppRepository) {
        this.htppRepository = htppRepository;
    }


    @GetMapping("/htpp-conc-response")
    public List<Htpp> getConcResponse(@Param("sampleId") String sampleId, @Param("categoryName") String categoryName) {
        return htppRepository.findBySampleIdAndCategoryName(sampleId, categoryName);
    }

    @GetMapping("/check-htpp-feature-bmd-info")
    public int checkFeatureBmdInfo(@Param("dtxsid") String dtxsid) {
        int result = 0;
        List<Htpp> htppList = htppRepository.findBydtxsid(dtxsid);
        for (Htpp htpp : htppList) {
            if (htpp.getApproach().equals("feature") && htpp.getBmd() != null) {
                result = 1;
                break;
            }
        }
        return result;

    }

    @GetMapping("/check-htpp-category-bmd-info")
    public int checkCategoryBmdInfo(@Param("dtxsid") String dtxsid) {
        int result = 0;
        List<Htpp> htppList = htppRepository.findBydtxsid(dtxsid);
        for (Htpp htpp : htppList) {
            if (htpp.getApproach().equals("category") && htpp.getBmd() != null) {
                result = 1;
                break;
            }
        }
        return result;

    }
}
