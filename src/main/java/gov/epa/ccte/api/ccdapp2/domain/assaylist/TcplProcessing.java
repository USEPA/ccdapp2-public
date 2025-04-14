package gov.epa.ccte.api.ccdapp2.domain.assaylist;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class TcplProcessing {


    @Field(name = "orderId")
    @JsonProperty("orderId")
    private Integer orderId;

    @Field(name = "assayRunType")
    @JsonProperty("assayRunType")
    private String assayRunType;

    @Field(name = "levelApplied")
    @JsonProperty("levelApplied")
    private Long levelApplied;

    @Field(name = "methodName")
    @JsonProperty("methodName")
    private String methodName;

    @Field(name = "description")
    @JsonProperty("description")
    private String description;


}
