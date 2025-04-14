package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class DeepLinkData {

    @JsonProperty("filter")
    @Field(name = "filter")
    private Filter filter;

    @JsonProperty("colStateSort")
    @Field(name = "colStateSort")
    private List<ColStateSortItem> colStateSort;

    @JsonProperty("page")
    @Field(name = "page")
    private String page;

    @JsonProperty("sort")
    @Field(name = "sort")
    private List<SortItem> sort;

    @JsonProperty("category")
    @Field(name = "category")
    private String category;

    @JsonProperty("gridRef")
    @Field(name = "gridRef")
    private String gridRef;

    @JsonProperty("activeSection")
    @Field(name = "activeSection")
    private String activeSection;
}