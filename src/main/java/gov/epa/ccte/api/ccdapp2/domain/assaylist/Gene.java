package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Gene {

    @JsonProperty("entrez_gene_id")
    @Field("entrez_gene_id")
    private Long entrezGeneId;

    @JsonProperty("gene_name")
    @Field("gene_name")
    private String geneName;

    @JsonProperty("gene_symbol")
    @Field("gene_symbol")
    private String geneSymbol;

    @JsonProperty("taxon_name")
    @Field("taxon_name")
    private String taxonName;

    @JsonProperty("common_name")
    @Field("common_name")
    private String commonName;
}
