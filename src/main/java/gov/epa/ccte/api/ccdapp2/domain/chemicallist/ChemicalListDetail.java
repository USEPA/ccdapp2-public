
package gov.epa.ccte.api.ccdapp2.domain.chemicallist;

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
@Document(collection = "chemicalListDetails")
@TypeAlias("chemicalListDetails")
public class ChemicalListDetail extends AbstractChemicalInformationWithAudit {

    @Field(name = "listName")
    @JsonProperty("listName")
    private String listName;

    @Field(name = "listLabel")
    @JsonProperty("listLabel")
    private String listLabel;

    @Field(name = "listShortDesc")
    @JsonProperty("listShortDesc")
    private String listShortDesc;

    @Field(name = "listCategory")
    @JsonProperty("listCategory")
    private String listCategory;

    @Field(name = "listVisibility")
    @JsonProperty("listVisbility")
    private String listVisbility;

    @Field(name = "listIsVisible")
    @JsonProperty("listIsVisible")
    private Boolean listIsVisible;

}
