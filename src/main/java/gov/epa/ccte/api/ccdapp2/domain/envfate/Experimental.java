package gov.epa.ccte.api.ccdapp2.domain.envfate;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

public class Experimental {

    @Field(name = "rawData")
    @JsonProperty("rawData")
    private ArrayList<ExperimentalRawData> expRawData = new ArrayList<>();

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
