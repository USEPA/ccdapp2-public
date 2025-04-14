package gov.epa.ccte.api.ccdapp2.domain.envfate;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

public class ExperimentalRawData {

    @Field(name = "description")
    @JsonProperty("description")
    private String description;

    @Field(name = "max_value")
    @JsonProperty("maxValue")
    private Double maxValue;

    @Field(name = "min_value")
    @JsonProperty("minValue")
    private Double minValue;

    @Field(name = "source")
    @JsonProperty("source")
    private String source;

    @Field(name = "value")
    @JsonProperty("value")
    private Double value;

    @Field(name = "experimentalDetails")
    @JsonProperty("experimentalDetails")
    private ArrayList<ExperimentalDetails> experimentalDetails = new ArrayList<>();



}
