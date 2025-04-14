package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "executiveSummaryPOD")
@TypeAlias("executiveSummaryPOD")
public class ExecutiveSummaryPod extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @NonNull
    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "oral")
    @JsonProperty("oral")
    private List<ExecutiveSummaryPodData> oral;

    @Field(name = "inhalation")
    @JsonProperty("inhalation")
    private List<ExecutiveSummaryPodData> inhalation;


}
