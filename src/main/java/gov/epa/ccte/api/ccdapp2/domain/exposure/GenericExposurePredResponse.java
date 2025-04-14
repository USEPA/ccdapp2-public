package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class GenericExposurePredResponse {

    @JsonProperty("dtxsid")
    private String dtxsid;

    @JsonProperty("predictor")
    private String predictor;

    @JsonProperty("label")
    private String label;

    @JsonProperty("value")
    private String value;

    @JsonProperty("units")
    private String units;

    @JsonProperty("reference")
    private String reference;
}
