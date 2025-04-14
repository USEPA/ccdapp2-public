package gov.epa.ccte.api.ccdapp2.domain.envfate;


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
@Document(collection = "fate")
@TypeAlias("fate")
public class Envfate extends AbstractAuditingEntity {

  @Id
  @JsonProperty("id")
  private  String id;

  @NonNull
  @Field("dtxsid")
  @JsonProperty("dtxsid")
  private String dtxsid;

  @Field(name = "fateDetails")
  @JsonProperty("fateDetails")
  private ArrayList<FateDetails> data= new ArrayList<>();

}
