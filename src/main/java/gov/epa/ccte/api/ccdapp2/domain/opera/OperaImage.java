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

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "operaImageDetails")
@TypeAlias("operaImageDetails")
public class OperaImage extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "dtxcid")
    @JsonProperty("dtxcid")
    private String dtxcid;

    @Field(name = "modelId")
    @JsonProperty("modelId")
    private long  modelId;

    @Field(name = "histo_graph")
    @JsonProperty("histoGraph")
    private byte[]  histoGraph;

    @Field(name = "scatter_graph")
    @JsonProperty("scatterGraph")
    private byte[]  scatterGraph;
}
