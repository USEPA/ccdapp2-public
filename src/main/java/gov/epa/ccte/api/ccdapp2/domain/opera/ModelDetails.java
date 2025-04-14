package gov.epa.ccte.api.ccdapp2.domain.opera;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ModelDetails {

    @Field(name = "modelName")
    @JsonProperty("modelName")
    private String modelName;

    @Field(name = "dataAccessability")
    @JsonProperty("dataAccessability")
    private String dataAccessability;

    @Field(name = "hasQmrfPdf")
    @JsonProperty("hasQmrfPdf")
    private Integer hasQmrfPdf;

    @Field(name = "modelId")
    @JsonProperty("modelId")
    private String modelId;

    @Field(name = "description")
    @JsonProperty("description")
    private String description;

    @Field(name = "source")
    @JsonProperty("source")
    private String source;

    @Field(name = "category")
    @JsonProperty("category")
    private String category;

    @Field(name = "qmrfReportUrl")
    @JsonProperty("qmrfReportUrl")
    private String qmrfReportUrl;
}
