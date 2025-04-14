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
@Document(collection = "htpp")
@TypeAlias("htpp")
public class Htpp extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;

    @Field(name = "sample_id")
    @JsonProperty("sampleId")
    private String sampleId;

    @Field(name = "categoryname")
    @JsonProperty("categoryName")
    private String categoryName;

    @Field(name = "category_name_description")
    @JsonProperty("categoryNameDescription")
    private String categoryNameDescription;

    @Field(name = "hitcall")
    @JsonProperty("hitCall")
    private Double hitCall;

    @Field(name = "bmd")
    @JsonProperty("bmd")
    private Double bmd;

    @Field(name = "top_over_cutoff")
    @JsonProperty("topOverCutoff")
    private Double topOverCutoff;

    @Field(name = "cutoff")
    @JsonProperty("cutOff")
    private Double cutOff;

    @Field(name = "number_of_feature")
    @JsonProperty("numberOfFeature")
    private Integer numberOfFeature;

    @Field(name = "channel")
    @JsonProperty("channel")
    private String channel;

    @Field(name = "module")
    @JsonProperty("module")
    private String module;

    @Field(name = "compartment")
    @JsonProperty("compartment")
    private String compartment;

    @Field(name = "pg_id")
    @JsonProperty("pgId")
    private Integer pgId;

    @Field(name = "stype")
    @JsonProperty("stype")
    private String stype;

    @Field(name = "min_conc")
    @JsonProperty("minConc")
    private Double minConc;

    @Field(name = "max_conc")
    @JsonProperty("maxConc")
    private Double maxConc;

    @Field(name = "n_conc")
    @JsonProperty("nConc")
    private Double nConc;

    @Field(name = "ctr_mean")
    @JsonProperty("ctrMean")
    private Double ctrMean;

    @Field(name = "ctr_sd")
    @JsonProperty("ctrSd")
    private Double ctrSd;

    @Field(name = "approach")
    @JsonProperty("approach")
    private String approach;

    @Field(name = "endpoint")
    @JsonProperty("endpoint")
    private String endpoint;

    @Field(name = "n_gt_cutoff")
    @JsonProperty("nGtCutoff")
    private Integer nGtCutoff;

    @Field(name = "fit_method")
    @JsonProperty("fitMethod")
    private String fitMethod;

    @Field(name = "rmse")
    @JsonProperty("rmse")
    private Double rmse;

    @Field(name = "a")
    @JsonProperty("a")
    private Double a;

    @Field(name = "er")
    @JsonProperty("er")
    private Double er;

    @Field(name = "bmr")
    @JsonProperty("bmr")
    private Double bmr;

    @Field(name = "bmdl")
    @JsonProperty("bmdl")
    private Double bmdl;

    @Field(name = "caikwt")
    @JsonProperty("caikwt")
    private Double caikwt;

    @Field(name = "mll")
    @JsonProperty("mll")
    private Double mll;

    @Field(name = "ac50")
    @JsonProperty("ac50")
    private Double ac50;

    @Field(name = "top_orig")
    @JsonProperty("topOrig")
    private Double topOrig;

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

    @Field(name = "bmd_orig")
    @JsonProperty("bmdOrig")
    private Double bmdOrig;

    @Field(name = "bmdu")
    @JsonProperty("bmdu")
    private Double bmdu;

    @Field(name = "conc")
    @JsonProperty("conc")
    private String conc;

    @Field(name = "resp")
    @JsonProperty("resp")
    private String resp;

    @Field(name = "cp_flag")
    @JsonProperty("cpFlag")
    private String cpFlag;

    @Field(name = "dataset")
    @JsonProperty("dataset")
    private String dataset;

    @Field(name = "tp")
    @JsonProperty("tp")
    private Double tp;

    @Field(name = "b")
    @JsonProperty("b")
    private Double b;

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

    @Field(name = "cell_type")
    @JsonProperty("cellType")
    private String cellType;

    @Field(name = "exp_dur_h")
    @JsonProperty("exposureDuration")
    private Integer exposureDuration;

    @Field(name = "feature_name_harmony")
    @JsonProperty("featureNameHarmony")
    private String featureNameHarmony;

    @Field(name = "qc_score")
    @JsonProperty("qc")
    private String qc;

    @Field(name = "flags")
    @JsonProperty("qcFlag")
    private String qcFlag;

    @Field(name = "flag_description")
    @JsonProperty("flagDescription")
    private String flagDescription;

    @Field(name = "seeding_density")
    @JsonProperty("seedingDensity")
    private Integer seedingDensity;

}
