package gov.epa.ccte.api.ccdapp2.domain.chemicalproperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class ChemicalPropertyData {

    @Field(name = "unit")
    @JsonProperty("unit")
    public String unit;

    @Field(name = "name")
    @JsonProperty("name")
    public String name;

    @Field(name = "predicted")
    @JsonProperty("predicted")
    private  Predicted predicted;

    @Field(name = "experimental")
    @JsonProperty("experimental")
    private  Experimental experimental;
}
