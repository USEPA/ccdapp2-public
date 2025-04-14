package gov.epa.ccte.api.ccdapp2.domain.envfate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class FateDetails {
    @Field(name = "unit")
    @JsonProperty("unit")
    private String unit;

    @Field(name = "name")
    @JsonProperty("name")
    private String name;

    @Field(name = "predicted")
    @JsonProperty("predicted")
    private Predicted predicted;


    @Field(name = "experimental")
    @JsonProperty("experimental")
    private Experimental experimental ;

}
