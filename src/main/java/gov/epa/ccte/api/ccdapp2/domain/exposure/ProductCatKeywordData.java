package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Data
public class ProductCatKeywordData {

   
    @JsonProperty("categorizationSubtype")
    @Field(name = "categorizationSubtype")
    private String categorizationSubtype;
   
    @JsonProperty("keywordSearch")
    @Field(name = "keywordSearch")
    private String keywordSearch;
   
    @JsonProperty("keywords")
    @Field(name = "keywords")
    private List<Keyword> keywords;
   
    @JsonProperty("sourceCount")
    @Field(name = "sourceCount")
    private Long sourceCount;

    

}
