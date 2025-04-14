package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class GeneInfo {

    @JsonProperty("entrezGeneId")
    @Field("entrezGeneId")
    private Long entrezGeneId;

    @JsonProperty("geneName")
    @Field("geneName")
    private String geneName;

    @JsonProperty("geneSymbol")
    @Field("geneSymbol")
    private String geneSymbol;

    @JsonProperty("taxonName")
    @Field("taxon_name")
    private String taxonName;

    @JsonProperty("commonName")
    @Field("common_name")
    private String commonName;
}
