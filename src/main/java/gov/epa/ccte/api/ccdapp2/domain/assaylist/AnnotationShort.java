package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class AnnotationShort {

    @Field(name = "assayComponentEndpointName")
    @JsonProperty("endpointName")
    private String endpointName;

    @Field(name = "geneSymbol")
    @JsonProperty("geneSymbol")
    private String geneSymbol;

    @Field(name = "organism")
    @JsonProperty("organism")
    private String organism;

    @Field(name = "tissue")
    @JsonProperty("tissue")
    private String tissue;

    @Field(name = "assayFormatType")
    @JsonProperty("assayFormatType")
    private String assayFormatType;

    @Field(name = "biologicalProcessTarget")
    @JsonProperty("biologicalProcessTarget")
    private String biologicalProcessTarget;

    @Field(name = "analysisDirection")
    @JsonProperty("analysisDirection")
    private String analysisDirection;

    @Field(name = "intendedTargetFamily")
    @JsonProperty("intendedTargetFamily")
    private String intendedTargetFamily;
}
