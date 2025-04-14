package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@ToString(callSuper = true)
public class ToxicInventoryData {

    @Field(name = "triURL")
    @JsonProperty("triURL")
    public String triURL;

}

