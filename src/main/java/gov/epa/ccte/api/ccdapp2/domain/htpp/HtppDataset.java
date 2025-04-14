package gov.epa.ccte.api.ccdapp2.domain.htpp;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "htpp_dataset")
@TypeAlias("htpp_dataset")
public class HtppDataset extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "dataset")
    @JsonProperty("dataset")
    public String dataset;

    @Field(name = "assaySourceName")
    @JsonProperty("assaySourceName")
    public String assaySourceName;

    @Field(name = "assaySourceLongName")
    @JsonProperty("assaySourceLongName")
    public String assaySourceLongName;

    @Field(name = "assaySourceDesc")
    @JsonProperty("assaySourceDesc")
    public String assaySourceDesc;

    @Field(name = "assayName")
    @JsonProperty("assayName")
    public String assayName;

    @Field(name = "assayDesc")
    @JsonProperty("assayDesc")
    public String assayDesc;

    @Field(name = "timepoint_hr")
    @JsonProperty("timepointHr")
    public String timepointHr;

    @Field(name = "cultureCondValue")
    @JsonProperty("cultureConditionValue")
    public String cultureConditionValue;

    @Field(name = "cultureCondNameValueType")
    @JsonProperty("cultureCondNameValueType")
    public String cultureCondNameValueType;

    @Field(name = "organismId")
    @JsonProperty("organismId")
    public String organismId;

    @Field(name = "organism")
    @JsonProperty("organism")
    public String organism;

    @Field(name = "tissue")
    @JsonProperty("tissue")
    public String tissue;

    @Field(name = "cellFormat")
    @JsonProperty("cellFormat")
    public String cellFormat;

    @Field(name = "cellShortName")
    @JsonProperty("cellShortName")
    public String cellShortName;

    @Field(name = "cellGrowthMode")
    @JsonProperty("cellGrowthMode")
    public String cellGrowthMode;

    @Field(name = "assayFootprint")
    @JsonProperty("assayFootprint")
    public String assayFootprint;

    @Field(name = "assayFormatType")
    @JsonProperty("assayFormatType")
    public String assayFormatType;

    @Field(name = "contentReadoutType")
    @JsonProperty("contentReadoutType")
    public String contentReadoutType;

    @Field(name = "dilutionSolvent")
    @JsonProperty("dilutionSolvent")
    public String dilutionSolvent;

    @Field(name = "dilutionSolvent_percent_max")
    @JsonProperty("dilutionSolventPercentMax")
    public String dilutionSolventPercentMax;

    @Field(name = "assayComponentEndpointDesc")
    @JsonProperty("assayComponentEndpointDesc")
    public String assayComponentEndpointDesc;

    @Field(name = "assayFunctionType")
    @JsonProperty("assayFunctionType")
    public String assayFunctionType;

    @Field(name = "keyPositiveControl")
    @JsonProperty("keyPositiveControl")
    public String keyPositiveControl;

    @Field(name = "keyPositiveControlConc_uM")
    @JsonProperty("keyPositiveControlConcUM")
    public String keyPositiveControlConcUM;

    @Field(name = "intendedTargetType")
    @JsonProperty("intendedTargetType")
    public String intendedTargetType;

    @Field(name = "reagentArid")
    @JsonProperty("reagentArid")
    public String reagentArid;

    @Field(name = "reagentReagentNameValue")
    @JsonProperty("reagentReagentNameValue")
    public String reagentReagentNameValue;

    @Field(name = "reagentReagentNameValueType")
    @JsonProperty("reagentReagentNameValueType")
    public String reagentReagentNameValueType;

    @Field(name = "reagentCultureOrAssay")
    @JsonProperty("reagentCultureOrAssay")
    public String reagentCultureOrAssay;
}
