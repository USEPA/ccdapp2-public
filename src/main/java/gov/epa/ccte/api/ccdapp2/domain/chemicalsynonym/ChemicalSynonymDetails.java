package gov.epa.ccte.api.ccdapp2.domain.chemicalsynonym;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class ChemicalSynonymDetails {

    @Field(name = "synonym")
    @JsonProperty("synonym")
    public String synonym;

    @Field(name = "quality")
    @JsonProperty("quality")
    public String quality;


}
