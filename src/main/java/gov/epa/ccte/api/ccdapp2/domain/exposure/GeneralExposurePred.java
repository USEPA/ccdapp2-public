package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class GeneralExposurePred {

    @Field(name = "predictor")
    @JsonProperty("predictor")
    private String predictor;

    @Field(name = "p_value")
    @JsonProperty("value")
    private String value;

    @Field(name = "units")
    @JsonProperty("units")
    private String units;

    @Field(name = "reference")
    @JsonProperty("reference")
    private String reference;
}
