package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class PredictedFunctionalUse {


    @JsonProperty("harmonizedFunctionalUse")
    @Field(name = "harmonizedFunctionalUse")
    private String harmonizedFunctionalUse;

    @JsonProperty("probability")
    @Field(name = "probability")
    private Double probability;


}
