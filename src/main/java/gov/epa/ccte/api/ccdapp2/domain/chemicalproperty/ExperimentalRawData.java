package gov.epa.ccte.api.ccdapp2.domain.chemicalproperty;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@ToString(callSuper = true)
public class ExperimentalRawData {

    @Field(name = "value")
    @JsonProperty("value")
    public Double value;

    @Field(name = "minValue")
    @JsonProperty("minValue")
    public Double minValue;

    @Field(name = "maxValue")
    @JsonProperty("maxValue")
    public Double maxValue;

    @Field(name = "source")
    @JsonProperty("source")
    public String source;

    @Field(name = "description")
    @JsonProperty("description")
    public String description;

    @Field(name = "experimentDetails")
    @JsonProperty("experimentalDetails")
    private ArrayList<ExperimentalDetails> experimentalDetails = new ArrayList<>();

}
