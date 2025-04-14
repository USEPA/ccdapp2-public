package gov.epa.ccte.api.ccdapp2.domain.relatedsubstances;


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
@Document(collection = "relatedSubstances")
@TypeAlias("relatedSubstances")
public class RelatedSubstances extends AbstractAuditingEntity {


    @Id
    @JsonProperty("id")
    private String id;

    @NonNull
    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;


    @Field("data")
    @JsonProperty("data")
    private ArrayList<RelatedSubstancesDetails> data = new ArrayList<>();


}
