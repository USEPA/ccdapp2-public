
package gov.epa.ccte.api.ccdapp2.domain.envfate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class PredictedRawData {

    @Field(name = "value")
    @JsonProperty("value")
    public Double value;

    @Field(name = "min_value")
    @JsonProperty("minValue")
    public Double minValue;

    @Field(name = "max_value")
    @JsonProperty("maxValue")
    public Double maxValue;

    @Field(name = "source")
    @JsonProperty("source")
    public String source;

    @Field(name = "description")
    @JsonProperty("description")
    public String description;

    @Field(name = "model_name")
    @JsonProperty("modelName")
    public String modelName;

    @Field(name = "model_id")
    @JsonProperty("modelId")
    public Integer modelId;

    @Field(name = "test_report_extension")
    @JsonProperty("testReportExtension")
    public String testReportExtension;

    @Field(name = "has_opera")
    @JsonProperty("hasOpera")
    public Boolean hasOpera;

    @Field(name = "global_applicability")
    @JsonProperty("globalApplicability")
    public Integer globalApplicability;

    @Field(name = "has_qmrf_pdf")
    @JsonProperty("hasQmrfPdf")
    public Boolean hasQmrfPdf;

}
