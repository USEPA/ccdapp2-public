package gov.epa.ccte.api.ccdapp2.domain.httr;

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
@Document(collection = "httr_dataset")
@TypeAlias("httr_dataset")
public class HttrDataset extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "study_id")
    @JsonProperty("studyId")
    private Integer studyId;

    @Field(name = "celltype")
    @JsonProperty("cellType")
    private String cellType;

    @Field(name = "dataset")
    @JsonProperty("dataset")
    private String dataset;

    @Field(name = "time")
    @JsonProperty("time")
    private String time;

    @Field(name = "media")
    @JsonProperty("media")
    private String media;

    @Field(name = "shrinkage")
    @JsonProperty("shrinkage")
    private String shrinkage;

    @Field(name = "plateEffect")
    @JsonProperty("plateEffect")
    private String plateEffect;

    @Field(name = "species")
    @JsonProperty("species")
    private String species;

    @Field(name = "hashkey")
    @JsonProperty("hashkey")
    private String hashkey;

    @Field(name = "datestamp")
    @JsonProperty("datestamp")
    private String datestamp;

    @Field(name = "assaySourceName")
    @JsonProperty("assaySourceName")
    private String assaySourceName;

    @Field(name = "assaySourceLongName")
    @JsonProperty("assaySourceLongName")
    private String assaySourceLongName;

    @Field(name = "assaySourceDesc")
    @JsonProperty("assaySourceDesc")
    private String assaySourceDesc;

    @Field(name = "assayDesc")
    @JsonProperty("assayDesc")
    private String assayDesc;

    @Field(name = "timepointHr")
    @JsonProperty("timepointHr")
    private String timepointHr;

    @Field(name = "cultureCondValue")
    @JsonProperty("cultureConditionValue")
    private String cultureConditionValue;

    @Field(name = "cultureCondNameValueType")
    @JsonProperty("cultureCondNameValueType")
    private String cultureCondNameValueType;

    @Field(name = "organismId")
    @JsonProperty("organismId")
    private Integer organismId;

    @Field(name = "organism")
    @JsonProperty("organism")
    private String organism;

    @Field(name = "tissue")
    @JsonProperty("tissue")
    private String tissue;

    @Field(name = "cellFormat")
    @JsonProperty("cellFormat")
    private String cellFormat;

    @Field(name = "cellShortName")
    @JsonProperty("cellShortName")
    private String cellShortName;

    @Field(name = "cellGrowthMode")
    @JsonProperty("cellGrowthMode")
    private String cellGrowthMode;

    @Field(name = "assayFootprint")
    @JsonProperty("assayFootprint")
    private String assayFootprint;

    @Field(name = "assayFormatType")
    @JsonProperty("assayFormatType")
    private String assayFormatType;

    @Field(name = "contentReadoutType")
    @JsonProperty("contentReadoutType")
    private String contentReadoutType;

    @Field(name = "dilutionSolvent")
    @JsonProperty("dilutionSolvent")
    private String dilutionSolvent;

    @Field(name = "dilutionSolventPercentMax")
    @JsonProperty("dilutionSolventPercentMax")
    private String dilutionSolventPercentMax;

    @Field(name = "assayComponentEndpointDesc")
    @JsonProperty("assayComponentEndpointDesc")
    private String assayComponentEndpointDesc;

    @Field(name = "assayFunctionType")
    @JsonProperty("assayFunctionType")
    private String assayFunctionType;

    @Field(name = "normalizedDataType")
    @JsonProperty("normalizedDataType")
    private String normalizedDataType;

    @Field(name = "analysisDirection")
    @JsonProperty("analysisDirection")
    private String analysisDirection;

    @Field(name = "keyPositiveControl")
    @JsonProperty("keyPositiveControl")
    private String keyPositiveControl;

    @Field(name = "keyPositiveControlConcUM")
    @JsonProperty("keyPositiveControlConcUM")
    private String keyPositiveControlConcUM;

    @Field(name = "signalDirection")
    @JsonProperty("signalDirection")
    private String signalDirection;

    @Field(name = "intendedTargetType")
    @JsonProperty("intendedTargetType")
    private String intendedTargetType;

    @Field(name = "reagentArid")
    @JsonProperty("reagentArid")
    private String reagentArid;

    @Field(name = "reagentReagentNameValue")
    @JsonProperty("reagentReagentNameValue")
    private String reagentReagentNameValue;

    @Field(name = "reagentReagentNameValueType")
    @JsonProperty("reagentReagentNameValueType")
    private String reagentReagentNameValueType;

    @Field(name = "reagentCultureOrAssay")
    @JsonProperty("reagentCultureOrAssay")
    private String reagentCultureOrAssay;
}
