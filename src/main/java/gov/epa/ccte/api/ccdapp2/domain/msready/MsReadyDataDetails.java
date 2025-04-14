package gov.epa.ccte.api.ccdapp2.domain.msready;


import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractChemicalInformation;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
public class MsReadyDataDetails extends AbstractChemicalInformation {

}
