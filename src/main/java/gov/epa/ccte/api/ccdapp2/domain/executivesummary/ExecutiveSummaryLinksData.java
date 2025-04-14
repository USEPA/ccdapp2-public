package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
public class ExecutiveSummaryLinksData {


    @Field(name = "id")
    @JsonProperty("id")
    private Integer id;

    @Field(name = "header")
    @JsonProperty("header")
    private String header;

    @Field(name = "link")
    @JsonProperty("link")
    private String link;

    @Field(name = "data")
    @JsonProperty("data")
    private String data;

    @Field(name = "enable_ind")
    @JsonProperty("enableIndicator")
    private Boolean enableIndicator;

    @Field(name = "display_data_json")
    @JsonProperty("displayDataJson")
    private List<DisplayDataJson> displayDataJson =new ArrayList<>();
}
