package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

public class DemographicExposurePred {

    @Field(name = "demographic")
    @JsonProperty("demographic")
    private String demographic;

    @Field(name = "predictor")
    @JsonProperty("predictor")
    private String predictor;

    @Field(name = "median")
    @JsonProperty("median")
    private String median;

    @Field(name = "l95")
    @JsonProperty("l95")
    private String l95;

    @Field(name = "u95")
    @JsonProperty("u95")
    private String u95;

    @Field(name = "units")
    @JsonProperty("units")
    private String units;

    @Field(name = "ad")
    @JsonProperty("ad")
    private String ad;

    @Field(name = "reference")
    @JsonProperty("reference")
    private String reference;
}
