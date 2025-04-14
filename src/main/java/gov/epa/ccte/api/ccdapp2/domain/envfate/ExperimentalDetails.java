
package gov.epa.ccte.api.ccdapp2.domain.envfate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuppressWarnings("unused")
public class ExperimentalDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Field(name = "Response Site")
    @JsonProperty("responseSite")
    private String responseSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Field(name = "Species")
    @JsonProperty("species")
    private String species;

}
