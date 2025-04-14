package gov.epa.ccte.api.ccdapp2.domain.opera;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class NearestNeighbors {

    @Field(name = "measured")
	@JsonProperty("measured")
	private Double measured;

    @Field(name = "neighbor_number")
	@JsonProperty("neighborNumber")
	private Integer neighborNumber;

    @Field(name = "gsid")
	@JsonProperty("gsid")
	private Integer gsid;

    @Field(name = "mol_image_png")
	@JsonProperty("molImagePng")
	private Boolean molImagePng;

    @Field(name = "dtxcid")
	@JsonProperty("dtxcid")
	private String dtxcid;

    @Field(name = "dtxsid")
	@JsonProperty("dtxsid")
	private String dtxsid;

    @Field(name = "result_value")
	@JsonProperty("resultValue")
	private Double resultValue;

    @Field(name = "preferred_name")
	@JsonProperty("preferredName")
	private String preferredName;

    @Field(name = "cid")
	@JsonProperty("cid")
	private Integer cid;
}
