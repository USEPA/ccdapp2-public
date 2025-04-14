
package gov.epa.ccte.api.ccdapp2.domain.chemicaldetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class PresenceInList {

    @Field(name = "label")
    @JsonProperty("label")
    private String label;

    @Field(name = "name")
    @JsonProperty("name")
    private String name;

    @Field(name = "shortDescription")
    @JsonProperty("shortDescription")
    private String shortDescription;

    @Field(name = "lists")
    @JsonProperty("lists")
    private List<PresenceInListList> lists;
}
