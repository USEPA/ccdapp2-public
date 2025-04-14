package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Annotation {

    @Field(name = "aeid")
    @JsonProperty("aeid")
    private Integer aeid;

    @Field(name = "assayComponentEndpointName")
    @JsonProperty("assayComponentEndpointName")
    private String assayComponentEndpointName;

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

    @Field(name = "burstAssay")
    @JsonProperty("burstAssay")
    private String burstAssay;

    @Field(name = "keyPositiveControl")
    @JsonProperty("keyPositiveControl")
    private String keyPositiveControl;

    @Field(name = "signalDirection")
    @JsonProperty("signalDirection")
    private String signalDirection;

    @Field(name = "intendedTargetType")
    @JsonProperty("intendedTargetType")
    private String intendedTargetType;

    @Field(name = "intendedTargetTypeSub")
    @JsonProperty("intendedTargetTypeSub")
    private String intendedTargetTypeSub;

    @Field(name = "intendedTargetFamily")
    @JsonProperty("intendedTargetFamily")
    private String intendedTargetFamily;

    @Field(name = "intendedTargetFamilySub")
    @JsonProperty("intendedTargetFamilySub")
    private String intendedTargetFamilySub;

    @Field(name = "assayComponentName")
    @JsonProperty("assayComponentName")
    private String assayComponentName;

    @Field(name = "assayComponentDesc")
    @JsonProperty("assayComponentDesc")
    private String assayComponentDesc;

    @Field(name = "assayComponentTargetDesc")
    @JsonProperty("assayComponentTargetDesc")
    private String assayComponentTargetDesc;

    @Field(name = "parameterReadoutType")
    @JsonProperty("parameterReadoutType")
    private String parameterReadoutType;

    @Field(name = "assayDesignType")
    @JsonProperty("assayDesignType")
    private String assayDesignType;

    @Field(name = "assayDesignTypeSub")
    @JsonProperty("assayDesignTypeSub")
    private String assayDesignTypeSub;

    @Field(name = "biologicalProcessTarget")
    @JsonProperty("biologicalProcessTarget")
    private String biologicalProcessTarget;

    @Field(name = "detectionTechnologyType")
    @JsonProperty("detectionTechnologyType")
    private String detectionTechnologyType;

    @Field(name = "detectionTechnologyTypeSub")
    @JsonProperty("detectionTechnologyTypeSub")
    private String detectionTechnologyTypeSub;

    @Field(name = "detectionTechnology")
    @JsonProperty("detectionTechnology")
    private String detectionTechnology;

    @Field(name = "signalDirectionType")
    @JsonProperty("signalDirectionType")
    private String signalDirectionType;

    @Field(name = "keyAssayReagentType")
    @JsonProperty("keyAssayReagentType")
    private String keyAssayReagentType;

    @Field(name = "keyAssayReagent")
    @JsonProperty("keyAssayReagent")
    private String keyAssayReagent;

    @Field(name = "technologicalTargetType")
    @JsonProperty("technologicalTargetType")
    private String technologicalTargetType;

    @Field(name = "technologicalTargetTypeSub")
    @JsonProperty("technologicalTargetTypeSub")
    private String technologicalTargetTypeSub;

    @Field(name = "assayName")
    @JsonProperty("assayName")
    private String assayName;

    @Field(name = "assayDesc")
    @JsonProperty("assayDesc")
    private String assayDesc;

    @Field(name = "timepointHr")
    @JsonProperty("timepointHr")
    private String timepointHr;

    @Field(name = "organism")
    @JsonProperty("organism")
    private String organism;

    @Field(name = "tissue")
    @JsonProperty("tissue")
    private String tissue;

    @Field(name = "cellFormat")
    @JsonProperty("cellFormat")
    private String cellFormat;

    @Field(name = "cellFreeComponentSource")
    @JsonProperty("cellFreeComponentSource")
    private String cellFreeComponentSource;

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

    @Field(name = "assayFormatTypeSub")
    @JsonProperty("assayFormatTypeSub")
    private String assayFormatTypeSub;

    @Field(name = "contentReadoutType")
    @JsonProperty("contentReadoutType")
    private String contentReadoutType;

    @Field(name = "dilutionSolvent")
    @JsonProperty("dilutionSolvent")
    private String dilutionSolvent;

    @Field(name = "dilutionSolventPercentMax")
    @JsonProperty("dilutionSolventPercentMax")
    private Integer dilutionSolventPercentMax;

    @Field(name = "assaySourceName")
    @JsonProperty("assaySourceName")
    private String assaySourceName;

    @Field(name = "assaySourcelongName")
    @JsonProperty("assaySourceLongName")
    private String assaySourceLongName;

    @Field(name = "assaySourceDesc")
    @JsonProperty("assaySourceDesc")
    private String assaySourceDesc;

}
