package gov.epa.ccte.api.ccdapp2.domain.adme;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

public class Ivive {

    @Field(name = "label")
    @JsonProperty("label")
    public String label;

    @Field(name = "description")
    @JsonProperty("description")
    public String description;

    @Field(name = "measured")
    @JsonProperty("measured")
    public String measured;

    @Field(name = "predicted")
    @JsonProperty("predicted")
    public String predicted;

    @Field(name = "computed")
    @JsonProperty("computed")
    public Double computed;

    @Field(name = "unit")
    @JsonProperty("unit")
    public String unit;

    @Field(name = "model")
    @JsonProperty("model")
    public String model;

    @Field(name = "reference")
    @JsonProperty("reference")
    public String reference;

    @Field(name = "percentile")
    @JsonProperty("percentile")
    public String percentile;

    @Field(name = "species")
    @JsonProperty("species")
    public String species;

    @Field(name = "data_source_species")
    @JsonProperty("dataSourceSpecies")
    public String dataSourceSpecies;

}
