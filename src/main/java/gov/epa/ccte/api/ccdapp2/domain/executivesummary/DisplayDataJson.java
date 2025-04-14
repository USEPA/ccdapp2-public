package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class DisplayDataJson {


    @JsonProperty("aopId")
    @Field(name = "aop_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer aopId;

    @JsonProperty("title")
    @Field(name = "title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @Field(name = "ac50")
    @JsonProperty("ac50")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double ac50;

    @Field(name = "gene_id")
    @JsonProperty("geneId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer geneId;

    @Field(name = "orgsm_nm")
    @JsonProperty("orgsmNm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orgsmNm;

    @Field(name = "tissue_tx")
    @JsonProperty("tissueTx")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tissueTx;

    @Field(name = "gene_symbol")
    @JsonProperty("geneSymbol")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String geneSymbol;

    @Field(name = "source_aeid")
    @JsonProperty("sourceAeid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer sourceAeid;

    @Field(name = "assay_frmt_typ_tx")
    @JsonProperty("assayFrmtTypTx")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String assayFrmtTypTx;

    @Field(name = "intended_target_family")
    @JsonProperty("intendedTargetFamily")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String intendedTargetFamily;

    @Field(name = "assay_component_endp_nm")
    @JsonProperty("assayComponentEndpNm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String assayComponentEndpNm;
}
