package gov.epa.ccte.api.ccdapp2.domain.chemicalproperty;


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

    @Field(name = "minValue")
    @JsonProperty("minValue")
    public Double minValue;

    @Field(name = "maxValue")
    @JsonProperty("maxValue")
    public Double maxValue;

    @Field(name = "source")
    @JsonProperty("source")
    public String source;

    @Field(name = "description")
    @JsonProperty("description")
    public String description;

    @Field(name = "modelName")
    @JsonProperty("modelName")
    public String modelName;

    @Field(name = "modelId")
    @JsonProperty("modelId")
    public Integer modelId;

    @Field(name = "hasOpera")
    @JsonProperty("hasOpera")
    public Boolean hasOpera;

    @Field(name = "globalApplicability")
    @JsonProperty("globalApplicability")
    public Integer globalApplicability;

    @Field(name = "hasQmrfPdf")
    @JsonProperty("hasQmrfPdf")
    public Boolean hasQmrfPdf;

    @Field("details")
    @JsonProperty("details")
    private Details details;

    @Field("qmrf")
    @JsonProperty("qmrf")
    private Qmrf qmrf;

}
