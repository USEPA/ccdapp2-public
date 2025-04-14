package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ProductionVolume {

    @JsonProperty("id")
    @Field(name = "id")
    private String id;

    @JsonProperty("abbreviation")
    @Field(name = "abbreviation")
    private String abbreviation;

    @JsonProperty("name")
    @Field(name = "name")
    private String name;

    @JsonProperty("standardUnit")
    @Field(name = "standardUnit")
    private String standardUnit;

    @JsonProperty("amount")
    @Field(name = "amount")
    private Double amount;

    @JsonProperty("cnt")
    @Field(name = "cnt")
    private int cnt;
}
