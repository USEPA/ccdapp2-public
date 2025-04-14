package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ReportedFunctionalUse {


    @Field(name = "harmonizedFunctionalUse")
    @JsonProperty("harmonizedFunctionalUse")
    private String harmonizedFunctionalUse;

    @Field(name = "reportedFunctionalUse")
    @JsonProperty("reportedFunctionalUse")
    private String reportedFunctionalUse;


}
