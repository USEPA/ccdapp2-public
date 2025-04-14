package gov.epa.ccte.api.ccdapp2.domain.msready;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "msReady")
@TypeAlias("msReady")
public class MsReady extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private  String id;

    @NonNull
    @Field(name = "dtxcid")
    @JsonProperty("dtxcid")
    private String dtxcid;

    @Field("data")
    @JsonProperty("data")
    private ArrayList<MsReadyDataDetails> data = new ArrayList<>();

}
