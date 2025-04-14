package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class SortItem {

    @Field(name = "sort")
    @JsonProperty("sort")
    private String sort;

    @Field(name = "colId")
    @JsonProperty("colId")
    private String colId;
}
