package gov.epa.ccte.api.ccdapp2.domain.opera;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class Performance {

    @Field(name = "5FoldICV")
    @JsonProperty("fivefoldicv")
    private List<List<Object>> fivefoldicv;

    @Field(name = "Train")
    @JsonProperty("train")
    private List<List<Object>> train;

    @Field(name = "External")
    @JsonProperty("external")
    private List<List<Object>> external;

}
