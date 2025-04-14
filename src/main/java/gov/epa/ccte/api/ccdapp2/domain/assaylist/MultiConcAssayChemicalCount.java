package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class MultiConcAssayChemicalCount {

    @JsonProperty("active")
    private Integer active;

    @JsonProperty("total")
    private Integer total;
}
