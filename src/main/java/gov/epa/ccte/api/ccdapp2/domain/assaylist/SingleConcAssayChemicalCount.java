package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class SingleConcAssayChemicalCount {

    @JsonProperty("singleActive")
    private Integer singleActive;

    @JsonProperty("singleTotal")
    private Integer singleTotal;
}
