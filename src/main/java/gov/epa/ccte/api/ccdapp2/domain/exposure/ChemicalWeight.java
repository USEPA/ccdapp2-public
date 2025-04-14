
package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Date;

@Data
@SuppressWarnings("unused")
public class ChemicalWeight {

    @Field(name = "id")
    @JsonProperty("id")
    private String id;

    @Field(name = "minimumWeightFraction")
    @JsonProperty("minimumWeightFraction")
    private int minimumWeightFraction;

    @Field(name = "ingredientsId")
    @JsonProperty("ingredientsId")
    private String ingredientsId;

    @Field(name = "maximumWeightFraction")
    @JsonProperty("maximumWeightFraction")
    private double maximumWeightFraction;

    @Field(name = "hitClass")
    @JsonProperty("hitClass")
    private String hitClass;

    @Field(name = "productName")
    @JsonProperty("productName")
    private String productName;

    @Field(name = "source")
    @JsonProperty("source")
    private String source;

    @Field(name = "downloadDate")
    @JsonProperty("downloadDate")
    private Date downloadDate;

    @Field(name = "webUrl")
    @JsonProperty("webUrl")
    private String webUrl;

    @Field(name = "isFromFunctionalUseList")
    @JsonProperty("isFromFunctionalUseList")
    private int isFromFunctionalUseList;

    @Field(name = "isFromIngredientsList")
    @JsonProperty("isFromIngredientsList")
    private int isFromIngredientsList;

    @Field(name = "isFromMsds")
    @JsonProperty("isFromMsds")
    private int isFromMsds;

    @Field(name = "dataSourcesDescription")
    @JsonProperty("dataSourcesDescription")
    private String dataSourcesDescription;

    @Field(name = "reportedFunctionalUse")
    @JsonProperty("reportedFunctionalUse")
    private String reportedFunctionalUse;

    @Field(name = "generalCategory")
    @JsonProperty("generalCategory")
    private String generalCategory;

    @Field(name = "productType")
    @JsonProperty("productType")
    private String productType;

    @Field(name = "description")
    @JsonProperty("description")
    private String description;

    @Field(name = "refinedProductType")
    @JsonProperty("refinedProductType")
    private String refinedProductType;

    @Field(name = "predictedWeightFraction05")
    @JsonProperty("predictedWeightFraction05")
    private String predictedWeightFraction05;

    @Field(name = "predictedWeightFraction95")
    @JsonProperty("predictedWeightFraction95")
    private String predictedWeightFraction95;

    @Field(name = "dataType")
    @JsonProperty("dataType")
    private String dataType;

    @Field(name = "productDescriptors")
    @JsonProperty("productDescriptors")
    private ArrayList<String> productDescriptors= new ArrayList<>();

}
