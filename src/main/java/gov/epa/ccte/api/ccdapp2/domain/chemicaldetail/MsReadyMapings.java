package gov.epa.ccte.api.ccdapp2.domain.chemicaldetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class MsReadyMapings {

    @Field(name = "dtxcid")
    @JsonProperty("dtxcid")
    private String dtxcid;

    @Field(name = "count")
    @JsonProperty("count")
    private Integer count;
}
