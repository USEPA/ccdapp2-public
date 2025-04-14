
package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

public class Keyword {

    
    @Field(name = "description")
    @JsonProperty("description")
    private String description;
   
    @Field(name = "keyword")
    @JsonProperty("keyword")
    private String keyword;

  

}
