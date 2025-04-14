package gov.epa.ccte.api.ccdapp2.domain.opera;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Msgs {
    @Field(name = "globalTitle")
	@JsonProperty("globalTitle")
	private String globalTitle;

    @Field(name = "confidenceTitle")
	@JsonProperty("confidenceTitle")
	private String confidenceTitle;

    @Field(name = "localTitle")
	@JsonProperty("localTitle")
	private String localTitle;
}
