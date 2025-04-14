
package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class CwfData {

    
    @Field(name = "dataType")
    @JsonProperty("dataType")
    private String dataType;
    
    @Field(name = "displayPuc")
    @JsonProperty("displayPuc")
    private String displayPuc;
    
    @Field(name = "generalCategory")
    @JsonProperty("generalCategory")
    private String generalCategory;
    
    @Field(name = "maximumWeightFraction")
    @JsonProperty("maximumWeightFraction")
    private Double maximumWeightFraction;
    
    @Field(name = "minimumWeightFraction")
    @JsonProperty("minimumWeightFraction")
    private Double minimumWeightFraction;
    
    @Field(name = "productCount")
    @JsonProperty("productCount")
    private Integer productCount;
    
    @Field(name = "productFamily")
    @JsonProperty("productFamily")
    private String productFamily;
    
    @Field(name = "productName")
    @JsonProperty("productName")
    private String productName;
    
    @Field(name = "productType")
    @JsonProperty("productType")
    private String productType;
    
    @Field(name = "productUrl")
    @JsonProperty("productUrl")
    private String productUrl;
    
    @Field(name = "pucDescription")
    @JsonProperty("pucDescription")
    private String pucDescription;
    
    @Field(name = "sourceDownloadDate")
    @JsonProperty("sourceDownloadDate")
    private String souceDownloadDate;
    
    @Field(name = "source")
    @JsonProperty("source")
    private String source;
    
    @Field(name = "sourceDescription")
    @JsonProperty("sourceDescription")
    private String sourceDescription;
    
    @Field(name = "sourceURL")
    @JsonProperty("sourceURL")
    private String sourceURL;
    
    @Field(name = "subtype")
    @JsonProperty("categorizationSubtype")
    private String subtype;
    

}
