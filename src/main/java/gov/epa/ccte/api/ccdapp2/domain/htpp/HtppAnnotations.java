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
@Document(collection = "htpp_annotations")
@TypeAlias("htpp_annotations")
public class HtppAnnotations extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "dataset")
    @JsonProperty("dataset")
    private String dataset;

    @Field(name = "endpoint")
    @JsonProperty("endpoint")
    private String endpoint;

    @Field(name = "endpointDescription")
    @JsonProperty("endpointDescription")
    private String endpointDescription;

    @Field(name = "categoryName")
    @JsonProperty("categoryName")
    private String categoryName;

    @Field(name = "channel")
    @JsonProperty("channel")
    private String channel;

    @Field(name = "module")
    @JsonProperty("module")
    private String module;

    @Field(name = "compartment")
    @JsonProperty("compartment")
    private String compartment;

    @Field(name = "numberOfFeatures")
    @JsonProperty("numberOfFeatures")
    private int numberOfFeatures;

    @Field(name = "assayComponentTargetDesc")
    @JsonProperty("assayComponentTargetDesc")
    private String assayComponentTargetDesc;

    @Field(name = "assayDesignType")
    @JsonProperty("assayDesignType")
    private String assayDesignType;

    @Field(name = "assayDesignTypeSub")
    @JsonProperty("assayDesignTypeSub")
    private String assayDesignTypeSub;

    @Field(name = "detectionTechnologyType")
    @JsonProperty("detectionTechnologyType")
    private String detectionTechnologyType;

    @Field(name = "detectionTechnologyTypeSub")
    @JsonProperty("detectionTechnologyTypeSub")
    private String detectionTechnologyTypeSub;

    @Field(name = "detectionTechnologyTypeSub2")
    @JsonProperty("detectionTechnologyTypeSub2")
    private String detectionTechnologyTypeSub2;

    @Field(name = "detectionTechnology")
    @JsonProperty("detectionTechnology")
    private String detectionTechnology;

    @Field(name = "signalDirectionType")
    @JsonProperty("signalDirectionType")
    private String signalDirectionType;

    @Field(name = "technologicalTargetType")
    @JsonProperty("technologicalTargetType")
    private String technologicalTargetType;

    @Field(name = "technologicalTargetTypeSub")
    @JsonProperty("technologicalTargetTypeSub")
    private String technologicalTargetTypeSub;

    @Field(name = "normalizedDataType")
    @JsonProperty("normalizedDataType")
    private String normalizedDataType;

    @Field(name = "analysisDirection")
    @JsonProperty("analysisDirection")
    private String analysisDirection;

    @Field(name = "signalDirection")
    @JsonProperty("signalDirection")
    private String signalDirection;
}
