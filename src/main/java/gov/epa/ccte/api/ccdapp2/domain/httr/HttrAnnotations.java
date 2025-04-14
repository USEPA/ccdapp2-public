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
@Document(collection = "httr_annotations")
@TypeAlias("httr_annotations")
public class HttrAnnotations extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "signature")
    @JsonProperty("signature")
    public String signature;

    @Field(name = "description")
    @JsonProperty("description")
    public String description;

    @Field(name = "geneTarget")
    @JsonProperty("geneTarget")
    public String geneTarget;

    @Field(name = "effectDirection")
    @JsonProperty("effectDirection")
    public String effectDirection;

    @Field(name = "source")
    @JsonProperty("source")
    public String source;

    @Field(name = "subsource")
    @JsonProperty("subsource")
    public String subsource;

    @Field(name = "type")
    @JsonProperty("type")
    public String type;

    @Field(name = "superTarget")
    @JsonProperty("superTarget")
    public String superTarget;

    @Field(name = "targetClass")
    @JsonProperty("targetClass")
    public String targetClass;

    @Field(name = "superTargetClass")
    @JsonProperty("superTargetClass")
    public String superTargetClass;
}
