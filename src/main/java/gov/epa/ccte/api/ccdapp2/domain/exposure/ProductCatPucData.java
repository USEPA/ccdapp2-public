package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
public class ProductCatPucData {


    @JsonProperty("categorizationSubtype")
    @Field(name = "categorizationSubtype")
    private String categorizationSubtype;

    @JsonProperty("displayPuc")
    @Field(name = "displayPuc")
    private String displayPuc;

    @JsonProperty("generalCategory")
    @Field(name = "generalCategory")
    private String generalCategory;

    @JsonProperty("productCount")
    @Field(name = "productCount")
    private Integer productCount;

    @JsonProperty("productFamily")
    @Field(name = "productFamily")
    private String productFamily;

    @JsonProperty("productType")
    @Field(name = "productType")
    private String productType;

    @JsonProperty("pucDescription")
    @Field(name = "pucDescription")
    private String pucDescription;


}
