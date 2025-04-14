
package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class RegionalScreeningData {


    @Field(name = "toxvalNumeric")
    @JsonProperty("toxvalNumeric")
    private Double toxvalNumeric;

    @Field(name = "THQ")
    @JsonProperty("thq")
    private String thq;

    @Field(name = "toxvalType")
    @JsonProperty("toxvalType")
    private String toxvalType;

    @Field(name = "toxvalUnits")
    @JsonProperty("toxvalUnits")
    private String toxvalUnits;


}
