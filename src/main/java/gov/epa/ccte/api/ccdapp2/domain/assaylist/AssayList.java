package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;


@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "assayEndpointLists")
@TypeAlias("assayEndpointLists")
public class AssayList extends AbstractAuditingEntity {

    @Id
    @JsonProperty(value = "id")
    private String id;

    @NonNull
    @Field("name")
    @JsonProperty("name")
    private String name;

    @Field("aeid")
    @JsonProperty("aeid")
    private Integer aeid;


    @Field("desc")
    @JsonProperty("desc")
    private String desc;

    @Field("gene")
    @JsonProperty("genes")
    private ArrayList<Gene> gene = new ArrayList<>();


    @Field("multi_conc_assay_chemical_count")
    @JsonProperty("multi_conc_assay_chemical_count")
    private MultiConcAssayChemicalCount multi_conc_assay_chemical_count;

    @Field("single_conc_assay_chemical_count")
    @JsonProperty("single_conc_assay_chemical_count")
    private SingleConcAssayChemicalCount single_conc_assay_chemical_count;


    @Field("vendorKey")
    @JsonProperty("vendorKey")
    private String vendorKey;

    @Field("vendorName")
    @JsonProperty("vendorName")
    private String vendorName;
}
