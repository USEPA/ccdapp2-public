package gov.epa.ccte.api.ccdapp2.domain.hazard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
public class Eco {

    @Field("name")
    @JsonProperty("name")
    private String name;

    @Field("rawData")
    @JsonProperty(value = "rawData")
    private List<RawData> rawData = new ArrayList<>();
}
