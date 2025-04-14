package gov.epa.ccte.api.ccdapp2.domain.relatedsubstances;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractChemicalInformation;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@ToString(callSuper = true)
public class RelatedSubstancesDetails extends AbstractChemicalInformation {

    @Field(name = "relatedHover")
    @JsonProperty("relatedHover")
    private String relatedHover;

}
