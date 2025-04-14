package gov.epa.ccte.api.ccdapp2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(collection = "chemicalImage")
@TypeAlias("vw_chemical_files")
@SuppressWarnings("unused")
public class ChemicalFiles {


    @Id
    @JsonProperty("id")
    private  String id;

    @NonNull
    @Field("dsstoxCompoundId")
    @JsonProperty("dtxcid")
    private String dtxcid;

    @NonNull
    @Field("dsstoxSubstanceId")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "image")
    @JsonProperty("image")
    private byte[] image;
    }


