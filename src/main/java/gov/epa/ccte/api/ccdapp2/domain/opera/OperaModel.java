package gov.epa.ccte.api.ccdapp2.domain.opera;

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
@Document(collection = "operaModelDetails")
@TypeAlias("operaModelDetails")
public class OperaModel extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "casrn")
    @JsonProperty("casrn")
    private String casrn;

    @Field(name = "modelTitle")
    @JsonProperty("modelTitle")
    private String modelTitle;

    @Field(name = "modelName")
    @JsonProperty("modelName")
    private String modelName;

    @Field(name = "modelId")
    @JsonProperty("modelId")
    private String modelId;


    @Field(name = "preferredName")
    @JsonProperty("preferredName")
    private String preferredName;

    @Field(name = "modelDetails")
    @JsonProperty("modelDetails")
    private ModelDetails modelDetails;

    @Field(name = "modelResults")
    @JsonProperty("modelResults")
    private ModelResults modelResults;

    @Field(name = "nearestNeighbors")
    @JsonProperty("nearestNeighbors")
    private List<NearestNeighbors> nearestNeighbors;

}
