package gov.epa.ccte.api.ccdapp2.domain.chemicalproperty;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@ToString(callSuper = true)
public class Predicted {

    @Field(name = "rawdata")
    @JsonProperty("rawData")
    private ArrayList<PredictedRawData> rawData = new ArrayList<>();

    @Field(name = "count")
    @JsonProperty("count")
    private Integer count;

    @Field(name = "mean")
    @JsonProperty("mean")
    private Double mean;

    @Field(name = "min")
    @JsonProperty("min")
    private Double min;

    @Field(name = "max")
    @JsonProperty("max")
    private Double max;

    @Field(name = "range")
    @JsonProperty("range")
    ArrayList<Double> range = new ArrayList<>();

    @Field(name = "median")
    @JsonProperty("median")
    private Double median;
}
