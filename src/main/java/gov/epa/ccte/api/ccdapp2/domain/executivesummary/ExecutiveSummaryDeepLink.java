package gov.epa.ccte.api.ccdapp2.domain.executivesummary;

import com.fasterxml.jackson.annotation.*;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "executiveSummaryDeepLink")
@TypeAlias("executiveSummaryDeepLink")
public class ExecutiveSummaryDeepLink extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private String id;


	@Field(name = "deeplinkId")
	@JsonProperty("deeplinkId")
	private Integer deeplinkId;

    @Field(name = "deepLinkRaw")
    @JsonProperty("deepLink")
    @JsonRawValue
    private String deepLink;

    @NonNull
    @Field(name = "header")
    @JsonProperty("header")
    private String header;


}
