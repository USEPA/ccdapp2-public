package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)

public class Filter{

	@JsonProperty("toxvalType")
	@Field(name = "toxvalType")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private FilterData toxvalType;

	@JsonProperty("studyType")
	@Field(name = "studyType")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private FilterData studyType;

	@JsonProperty("source")
	@Field(name = "source")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private FilterData source;

	@JsonProperty("exposureRoute")
	@Field(name = "exposureRoute")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private FilterData exposureRoute;

	@JsonProperty("riskAssessmentClass")
	@Field(name = "riskAssessmentClass")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private filterDataWithCondition riskAssessment;
}
