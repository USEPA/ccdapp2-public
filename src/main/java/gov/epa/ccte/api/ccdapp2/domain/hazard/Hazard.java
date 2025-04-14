package gov.epa.ccte.api.ccdapp2.domain.hazard;

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
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "hazard")
@TypeAlias("hazard")
public class Hazard extends AbstractAuditingEntity {



    @NonNull
    @Field("dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Id
    @JsonProperty("id")
    private  String id;


    @Field("eco")
    @JsonProperty(value = "eco")
    private ArrayList<Eco> eco = new ArrayList<>();

    @Field("human")
    @JsonProperty(value = "human")
    private ArrayList<Human> human = new ArrayList<>();

}
