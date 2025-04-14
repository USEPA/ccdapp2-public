package gov.epa.ccte.api.ccdapp2.domain.htpp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Citations {

    @Field(name = "pmid")
    @JsonProperty("pmid")
    private String pmid;

    @Field(name = "author")
    @JsonProperty("author")
    private String author;

    @Field(name = "title")
    @JsonProperty("title")
    private String title;

    @Field(name = "citation")
    @JsonProperty("citation")
    private String citation;

    @Field(name = "doi")
    @JsonProperty("doi")
    private String doi;
}
