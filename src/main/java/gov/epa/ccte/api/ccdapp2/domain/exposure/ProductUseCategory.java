
package gov.epa.ccte.api.ccdapp2.domain.exposure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
@SuppressWarnings("unused")
public class ProductUseCategory {


        @Field(name = "id")
        @JsonProperty("id")
        private String id;

        @Field(name = "numberOfSources")
        @JsonProperty("numberOfSources")
        private int numberOfSources;

        @Field(name = "source")
        @JsonProperty("source")
        private String source;

        @Field(name = "downloadDate")
        @JsonProperty("downloadDate")
        private Date downloadDate;

        @Field(name = "webUrl")
        @JsonProperty("webUrl")
        private String webUrl;

        @Field(name = "dataSourcesDescription")
        @JsonProperty("dataSourcesDescription")
        private String dataSourcesDescription;

        @Field(name = "cassetteKeyword1")
        @JsonProperty("cassetteKeyword1")
        private String cassetteKeyword1;

        @Field(name = "cassetteKeyword2")
        @JsonProperty("cassetteKeyword2")
        private String cassetteKeyword2;

        @Field(name = "cassetteKeyword3")
        @JsonProperty("cassetteKeyword3")
        private String cassetteKeyword3;

        @Field(name = "cassetteKeyword4")
        @JsonProperty("cassetteKeyword4")
        private String cassetteKeyword4;

        @Field(name = "cassetteKeyword5")
        @JsonProperty("cassetteKeyword5")
        private String cassetteKeyword5;

        @Field(name = "actorSourceName")
        @JsonProperty("actorSourceName")
        private String actorSourceName;

        @Field(name = "cassetteKeyword1Description")
        @JsonProperty("cassetteKeyword1Description")
        private String cassetteKeyword1Description;

        @Field(name = "cassetteKeyword2Description")
        @JsonProperty("cassetteKeyword2Description")
        private String cassetteKeyword2Description;

        @Field(name = "cassetteKeyword3Description")
        @JsonProperty("cassetteKeyword3Description")
        private String cassetteKeyword3Description;

        @Field(name = "cassetteKeyword4Description")
        @JsonProperty("cassetteKeyword4Description")
        private String cassetteKeyword4Description;

        @Field(name = "cassetteKeyword5Description")
        @JsonProperty("cassetteKeyword5Description")
        private String cassetteKeyword5Description;

        @Field(name = "cpcatCassettes")
        @JsonProperty("cpcatCassettes")
        private List<String> cpcatCassettes;

        @Field(name = "categorizationType")
        @JsonProperty("categorizationType")
        private String categorizationType;

        @Field(name = "categorizationSubtype")
        @JsonProperty("categorizationSubtype")
        private String categorizationSubtype;

        @Field(name = "cassettes")
        @JsonProperty("cassettes")
        private List<List<String>> cassettes;


    }
