package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class Aop {


    @Field(name = "aopId")
    @JsonProperty("aopId")
    private Integer aopId;

    @Field(name = "aopTitle")
    @JsonProperty("aopTitle")
    private String aopTitle;


}
