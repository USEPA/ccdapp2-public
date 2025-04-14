
package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "exposureChemicalWeightFraction")
@TypeAlias("exposureChemicalWeightFraction")
public class ExposureChemicalWeightFraction extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "data")
    @JsonProperty("data")
    private List<CwfData> data;

    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;



}
