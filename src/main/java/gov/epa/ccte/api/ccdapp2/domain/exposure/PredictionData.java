package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class PredictionData {

    @JsonProperty("label")
    @Field(name = "label")
    private String label;

    @JsonProperty("median")
    @Field(name = "median")
    private String median;

    @JsonProperty("percentile9th")
    @Field(name = "percentile9th")
    private String percentile9th;

    @JsonProperty("hoverMsg")
    @Field(name = "hoverMsg")
    private String hoverMsg;

}
