package gov.epa.ccte.api.ccdapp2.domain.httr;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "httr")
@TypeAlias("httr")
public class Httr extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "celltype")
    @JsonProperty("cellType")
    private String cellType;

    @Field(name = "signature")
    @JsonProperty("signature")
    private String signature;

    @Field(name = "target")
    @JsonProperty("superTarget")
    private String superTarget;

    @Field(name = "target_class")
    @JsonProperty("targetClass")
    private String targetClass;

    @Field(name = "target_level")
    @JsonProperty("superTargetLevel")
    private String superTargetLevel;

    @Field(name = "hitcall")
    @JsonProperty("hitCall")
    private Double hitCall;

    @Field(name = "top")
    @JsonProperty("top")
    private Double top;

    @Field(name = "bmd")
    @JsonProperty("bmd")
    private Double bmd;

    @Field(name = "top_over_cutoff")
    @JsonProperty("topOverCutoff")
    private Double topOverCutoff;

    @Field(name = "fit_method")
    @JsonProperty("fitMethod")
    private String fitMethod;

    @Field(name = "source")
    @JsonProperty("source")
    private String source;

    @Field(name = "rmse")
    @JsonProperty("rmse")
    private Double rmse;

    @Field(name = "cutoff")
    @JsonProperty("cutOff")
    private Double cutOff;

    @Field(name = "n_gt_cutoff")
    @JsonProperty("nGtCutoff")
    private Integer nGtCutoff;

    @Field(name = "a")
    @JsonProperty("a")
    private Double a;

    @Field(name = "b")
    @JsonProperty("b")
    private Double b;

    @Field(name = "tp")
    @JsonProperty("tp")
    private Double tp;

    @Field(name = "p")
    @JsonProperty("p")
    private Double p;

    @Field(name = "q")
    @JsonProperty("q")
    private Double q;

    @Field(name = "ga")
    @JsonProperty("ga")
    private Double ga;

    @Field(name = "la")
    @JsonProperty("la")
    private Double la;

    @Field(name = "er")
    @JsonProperty("er")
    private Double er;

    @Field(name = "bmr")
    @JsonProperty("bmr")
    private Double bmr;

    @Field(name = "bmdl")
    @JsonProperty("bmdl")
    private Double bmdl;

    @Field(name = "bmdu")
    @JsonProperty("bmdu")
    private Double bmdu;

    @Field(name = "caikwt")
    @JsonProperty("caikwt")
    private Double caikwt;

    @Field(name = "mll")
    @JsonProperty("mll")
    private Double mll;

    @Field(name = "ac50")
    @JsonProperty("ac50")
    private Double ac50;

    @Field(name = "ac50_loss")
    @JsonProperty("ac50Loss")
    private String ac50Loss;

    @Field(name = "ac5")
    @JsonProperty("ac5")
    private Double ac5;

    @Field(name = "ac10")
    @JsonProperty("ac10")
    private Double ac10;

    @Field(name = "ac20")
    @JsonProperty("ac20")
    private Double ac20;

    @Field(name = "acc")
    @JsonProperty("acc")
    private Double acc;

    @Field(name = "ac1sd")
    @JsonProperty("ac1sd")
    private Double ac1sd;

    @Field(name = "subsource")
    @JsonProperty("subsource")
    private String subsource;

    @Field(name = "direction")
    @JsonProperty("direction")
    private String direction;

    @Field(name = "number_of_genes")
    @JsonProperty("ngene")
    private long ngene;

    @Field(name = "description")
    @JsonProperty("description")
    private String description;

    @Field(name = "gene_target")
    @JsonProperty("geneTarget")
    private String geneTarget;

    @Field(name = "sample_id")
    @JsonProperty("sampleId")
    private String sampleId;

    @Field(name = "conc")
    @JsonProperty("conc")
    private String conc;

    @Field(name = "dataset")
    @JsonProperty("dataset")
    private String dataset;

    @Field(name = "resp")
    @JsonProperty("response")
    private String response;

    @JsonProperty("profile")
    private String profile;

    @Field(name = "qc_score")
    @JsonProperty("qc")
    private String qc;

    @Field(name = "flags")
    @JsonProperty("qcFlag")
    private String qcFlag;

    @Field(name = "flag_description")
    @JsonProperty("flagDescription")
    private String flagDescription;
    
    @Field(name = "bmr_scale")
    @JsonProperty("bmrScale")
    private Double bmrScale;

    @Field(name = "type")
    @JsonProperty("type")
    private String type;

    @Field(name = "genelist")
    @JsonProperty("geneList")
    private String geneList;

    @Field(name = "effect_direction")
    @JsonProperty("effectDirection")
    private String effectDirection;

    @Field(name = "study_id")
    @JsonProperty("studyId")
    private Integer studyId;

    @Field(name = "time")
    @JsonProperty("time")
    private Integer time;

    @Field(name = "media")
    @JsonProperty("media")
    private String media;


}
