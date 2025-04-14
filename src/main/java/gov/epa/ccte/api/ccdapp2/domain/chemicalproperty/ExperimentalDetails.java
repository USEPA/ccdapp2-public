package gov.epa.ccte.api.ccdapp2.domain.chemicalproperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuppressWarnings("unused")
public class ExperimentalDetails {

    @Field(name = "name")
    @JsonProperty("name")
    private String name;

    @Field(name = "dtxrid")
    @JsonProperty("dtxrid")
    private String dtxrid;

    @Field(name = "value")
    @JsonProperty("value")
    private String value;

}
