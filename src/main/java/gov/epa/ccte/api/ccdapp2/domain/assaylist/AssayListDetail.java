
package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import gov.epa.ccte.api.ccdapp2.domain.AbstractChemicalInformation;
import gov.epa.ccte.api.ccdapp2.domain.AbstractChemicalInformationWithAudit;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "assayListDetails")
@TypeAlias("assayListDetails")
public class AssayListDetail extends AbstractChemicalInformationWithAudit {

    @Field(name = "endpointName")
    @JsonProperty("endpointName")
    private String endpointName;

    @Field(name = "ac50")
    @JsonProperty("ac50")
    private Double ac50;

    @Field(name = "hitc")
    @JsonProperty("hitc")
    private Integer hitc;

    @Field(name = "logAc50")
    @JsonProperty("logAc50")
    private Double logAc50;

    @Field(name = "scaledTop")
    @JsonProperty("scaledTop")
    private String scaledTop;

    @Field(name = "top")
    @JsonProperty("top")
    private Double top;

    @Field(name = "bmad")
    @JsonProperty("bmad")
    private Double bmad;

    @Field(name = "max_med_val")
    @JsonProperty("maxMedVal")
    private Double maxMedVal;

    @Field(name = "max_med_conc")
    @JsonProperty("maxMedConc")
    private Double maxMedConc;

}
