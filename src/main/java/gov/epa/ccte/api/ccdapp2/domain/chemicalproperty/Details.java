package gov.epa.ccte.api.ccdapp2.domain.chemicalproperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Details {

    @Field(name = "value")
    @JsonProperty("value")
    private String value;

    @Field(name = "link")
    @JsonProperty("link")
    private String link;

    @Field(name = "showLink")
    @JsonProperty("showLink")
    private Boolean showLink;

}
