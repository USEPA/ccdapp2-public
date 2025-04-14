package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class ColStateSortItem{
	
	@Field(name = "colId")
	@JsonProperty("colId")
	private String colId;

	@Field(name = "sort")
	@JsonProperty("sort")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String sort;

	@Field(name = "sortIndex")
	@JsonProperty("sortIndex")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String sortIndex;
}
