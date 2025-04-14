package gov.epa.ccte.api.ccdapp2.repository.callback;

import gov.epa.ccte.api.ccdapp2.domain.chemicaldetail.ChemicalDetail;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.core.mapping.event.AfterConvertCallback;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveCallback;
import org.springframework.stereotype.Component;

@Slf4j
@Order(1)
@Component
public class ChemicalDetailCallback implements  BeforeConvertCallback<ChemicalDetail>,
                                                AfterConvertCallback<ChemicalDetail>,
                                                BeforeSaveCallback<ChemicalDetail>{
    @Override
    public ChemicalDetail onBeforeConvert(ChemicalDetail chemicalDetail, String s) {
        log.debug("onBeforeConvert");

        return chemicalDetail;
    }

    @Override
    public ChemicalDetail onBeforeSave(ChemicalDetail chemicalDetail, Document document, String s) {
        log.debug("onBeforeSave");

        return chemicalDetail;
    }

    @Override
    public ChemicalDetail onAfterConvert(ChemicalDetail chemicalDetail, Document document, String s) {
        log.debug("onAfterConvert");

/*        if(document.get("dtxsid").equals("DTXSID00000000"))
            document.put("dtxsid", null);*/

        if(chemicalDetail.getDsstoxSubstanceId() == null || chemicalDetail.getDsstoxSubstanceId().equalsIgnoreCase("DTXSID00000000"))
            chemicalDetail.setDsstoxSubstanceId(null);

        return chemicalDetail;
    }
}
