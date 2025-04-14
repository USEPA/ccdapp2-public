
package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@ToString(callSuper = true)
public class PhyschemData {


    @Field(name = "min")
    @JsonProperty("min")
    private String min;

    @Field(name = "endp_abbr")
    @JsonProperty("endpointAbbr")
    private String endpointAbbr;

    @Field(name = "step")
    @JsonProperty("step")
    private String step;

    @Field(name = "logvalue")
    @JsonProperty("logvalue")
    private String logvalue;

    @Field(name = "range")
    @JsonProperty("range")
    private ArrayList<Range> range= new ArrayList<>();



}
