package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@ToString(callSuper = true)
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "assayEndpointDetail")
@TypeAlias("assayEndpointDetail")
public class AssayDetailShort {

    @Id
    @JsonProperty("id")
    private String id;

    @NonNull
    @Field(name = "assayComponentEndpointName")
    @JsonProperty("assayComponentEndpointName")
    private String assayComponentEndpointName;

    @Field(name = "annotation")
    @JsonProperty("annotation")
    private ArrayList<AnnotationShort> annotation = new ArrayList<>();


}
