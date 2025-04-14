
package gov.epa.ccte.api.ccdapp2.domain.assaylist;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Reagent {

    @Field(name = "orderId")
    @JsonProperty("orderId")
    private String orderId;

    @Field(name = "reagentType")
    @JsonProperty("reagentType")
    private String reagentType;

    @Field(name = "reagentValue")
    @JsonProperty("reagentValue")
    private String reagentValue;

    @Field(name = "cultureOrAssay")
    @JsonProperty("cultureOrAssay")
    private String cultureOrAssay;
}
