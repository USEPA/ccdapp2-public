package gov.epa.ccte.api.ccdapp2.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public abstract class AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    // Auditing fields
    @Version
    @Setter(AccessLevel.PROTECTED)
    private Long version;

    @Field("createdDate")
    @JsonProperty("createdDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date createdDate;

    @Field("lastModifiedDate")
    @JsonProperty("lastModifiedDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date lastModifiedDate;

    @Field("createdBy")
    @JsonProperty("createdBy")
    private String createdBy;

/*
    @CreatedBy
    @Field("created_by")
    private String createdBy;

    @LastModifiedBy
    @Field("last_modified_by")
    private String lastModifiedBy;
*/

}
