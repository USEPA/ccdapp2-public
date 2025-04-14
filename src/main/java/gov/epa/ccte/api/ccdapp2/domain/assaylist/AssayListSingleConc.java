package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(collection = "singleConcListDetails")
@TypeAlias("singleConcListDetails")
public class AssayListSingleConc {


    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "aeid")
    @JsonProperty("aeid")
    private Long aeid;

    @Id
    @JsonProperty(value = "id")
    @JsonIgnore
    private String id;

    @Field(name = "casrn")
    @JsonProperty("casrn")
    private String casrn;

    @Field(name = "endpointName")
    @JsonProperty("endpointName")
    private String endpointName;

    @Field(name = "preferredName")
    @JsonProperty("preferredName")
    private String preferredName;


    @Field(name = "hitc")
    @JsonProperty("hitc")
    private Integer hitc;

    @Field(name = "coff")
    @JsonProperty("coff")
    private double coff;

    @Field(name = "bmad")
    @JsonProperty("bmad")
    private double bmad;


    @Field(name = "top")
    @JsonProperty("top")
    private double top;


    @Field(name = "max_med_val")
    @JsonProperty("maxMedVal")
    private double maxMedVal;

    @Field(name = "max_med_conc")
    @JsonProperty("maxMedConc")
    private double maxMedConc;
}


