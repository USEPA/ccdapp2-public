package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class FilterData {

    @Field(name = "filter")
    @JsonProperty("filter")
    private String filter;

    @Field(name = "type")
    @JsonProperty("type")
    private String type;

    @Field(name = "filterType")
    @JsonProperty("filterType")
    private String filterType;
}
