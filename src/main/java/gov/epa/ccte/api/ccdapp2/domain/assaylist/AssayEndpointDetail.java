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
public class AssayEndpointDetail {

    @Id
    @JsonProperty("id")
    private String id;

    @NonNull
    @Field(name = "assayName")
    @JsonProperty("assayName")
    private String assayName;

    @Field(name = "assayComponentEndpointName")
    @JsonProperty("assayComponentEndpointName")
    private String assayComponentEndpointName;

    @Field(name = "annotation")
    @JsonProperty("annotation")
    private ArrayList<Annotation> annotation = new ArrayList<>();

    @Field(name = "gene")
    @JsonProperty("gene")
    private ArrayList<GeneInfo> gene = new ArrayList<>();

    @Field(name = "aops")
    @JsonProperty("aops")
    private ArrayList<Aop> aops = new ArrayList<>();

    @Field(name = "citations")
    @JsonProperty("citations")
    private ArrayList<Citation> citations = new ArrayList<>();

    @Field(name = "createdDate")
    @JsonProperty("createdDate")
    private String createdDate;

    @Field(name = "lastModifiedDate")
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;

    @Field(name = "tcplProcessing")
    @JsonProperty("tcplProcessing")
    private ArrayList<TcplProcessing> tcplProcessing = new ArrayList<>();

    @Field(name = "reagents")
    @JsonProperty("reagents")
    private ArrayList<Reagent> reagents = new ArrayList<>();

}


