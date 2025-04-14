package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Range {


    @Field(name = "color")
    @JsonProperty("color")
    private String color;

    @Field(name = "range")
    @JsonProperty("range")
    private String range;



}
