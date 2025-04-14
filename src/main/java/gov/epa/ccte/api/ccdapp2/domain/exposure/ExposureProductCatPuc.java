
package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "exposureProductCatPuc")
@TypeAlias("exposureProductCatPuc")
public class ExposureProductCatPuc extends AbstractAuditingEntity {


    @NonNull
    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Id
    @JsonProperty("id")
    private  String id;
    @JsonProperty("data")
    @Field(name = "data")
    private List<ProductCatPucData> data;
    


  

}
