package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class filterDataWithCondition {


    @Field(name = "operator")
    @JsonProperty("operator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String operator;

    @JsonProperty("condition1")
    @Field(name = "condition1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private FilterData condition1;

    @JsonProperty("condition2")
    @Field(name = "condition2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private FilterData condition2;


    @Field(name = "filter")
    @JsonProperty("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String filter;

    @Field(name = "type")
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;

    @Field(name = "filterType")
    @JsonProperty("filterType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String filterType;

}
