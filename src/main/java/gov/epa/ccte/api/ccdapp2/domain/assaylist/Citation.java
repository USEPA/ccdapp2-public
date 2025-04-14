package gov.epa.ccte.api.ccdapp2.domain.assaylist;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Citation {

    @Field(name = "pmid")
    @JsonProperty("pmid")
    private Integer pmid;

    @Field(name = "author")
    @JsonProperty("author")
    private String author;

    @Field(name = "citation")
    @JsonProperty("citation")
    private String citation;

    @Field(name = "doi")
    @JsonProperty("doi")
    private String doi;

    @Field(name = "otherId")
    @JsonProperty("otherId")
    private String otherId;

    @Field(name = "otherSource")
    @JsonProperty("otherSource")
    private String otherSource;

    @Field(name = "title")
    @JsonProperty("title")
    private String title;

    @Field(name = "url")
    @JsonProperty("url")
    private String url;

}
