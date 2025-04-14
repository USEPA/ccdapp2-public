package gov.epa.ccte.api.ccdapp2.domain.opera;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ModelResults {

    @Field(name = "msgs")
	@JsonProperty("msgs")
	private Msgs msgs;

    @Field(name = "confidence")
	@JsonProperty("confidence")
	private Double confidence;

	@Field(name = "standardUnit")
	@JsonProperty("standardUnit")
	private String standardUnit;

	@Field(name = "operaVersion")
	@JsonProperty("operaVersion")
	private String operaVersion;

    @Field(name = "global")
	@JsonProperty("global")
	private Integer global;

    @Field(name = "predicted")
	@JsonProperty("predicted")
	private Double predicted;

	@Field(name = "experimental")
	@JsonProperty("experimental")
	private String experimental;

    @Field(name = "local")
	@JsonProperty("local")
	private Double local;

	@Field(name = "performance")
	@JsonProperty("performance")
    private Performance performance;
}
