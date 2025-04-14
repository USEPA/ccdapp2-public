package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class MonitoringData {


    @Field(name = "label")
    @JsonProperty("label")
    public String label;

    @Field(name = "median")
    @JsonProperty("median")
    public Double median;

    @Field(name = "upper95th")
    @JsonProperty("upper95th")
    public Double upper95th;

    @Field(name = "lower95th")
    @JsonProperty("lower95th")
    public Double lower95th;

    @Field(name = "hoverMsg")
    @JsonProperty("hoverMsg")
    public String hoverMsg;


}
