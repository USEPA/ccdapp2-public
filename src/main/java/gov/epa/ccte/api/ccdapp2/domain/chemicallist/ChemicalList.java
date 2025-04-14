package gov.epa.ccte.api.ccdapp2.domain.chemicallist;


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
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "chemicalLists")
@TypeAlias("chemicalLists")
public class ChemicalList extends AbstractAuditingEntity {

    @Id
    @JsonProperty(value = "id")
    private String id;

    @NonNull
    @Field("name")
    @JsonProperty("name")
    private String name;

    @NonNull
    @Field("label")
    @JsonProperty("label")
    private String label;


    @Field("type")
    @JsonProperty("type")
    private String type;

    @Field("visibility")
    @JsonProperty("visibility")
    private String visibility;

    @Field("isVisible")
    @JsonProperty("isVisible")
    private Boolean isVisible;

    @Field("shortDescription")
    @JsonProperty("shortDescription")
    private String shortDescription;

    @Field("longDescription")
    @JsonProperty("longDescription")
    private String longDescription;

    @Field("chemicalCount")
    @JsonProperty("chemicalCount")
    private int chemicalCount;

    @Field(name = "listCategory")
    @JsonProperty("listCategory")
    private String listCategory;


    // enum type values
    public enum VisibilityOptions {PUBLIC, INTERNAL, PRIVATE}
}
