package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ExecutiveSummaryPodData {

    @Field(name = "label")
    @JsonProperty("label")
    private String label;

    @Field(name = "max")
    @JsonProperty("max")
    private Double max;

    @Field(name = "min")
    @JsonProperty("min")
    private Double min;

}
