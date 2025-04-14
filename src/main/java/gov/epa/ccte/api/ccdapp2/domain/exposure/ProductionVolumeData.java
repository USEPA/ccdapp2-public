package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ProductionVolumeData {

    @JsonProperty("id")
    @Field(name = "id")
    private Integer id;

    @JsonProperty("abbreviation")
    @Field(name = "abbreviation")
    private String abbreviation;

    @JsonProperty("name")
    @Field(name = "name")
    private String name;

    @JsonProperty("standardUnit")
    @Field(name = "standard_Unit")
    private String standardUnit;

    @JsonProperty("amount")
    @Field(name = "amount")
    private String amount;

    @JsonProperty("cnt")
    @Field(name = "cnt")
    private Integer cnt;
}
