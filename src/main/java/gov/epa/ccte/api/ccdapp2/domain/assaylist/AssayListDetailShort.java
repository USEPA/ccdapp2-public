package gov.epa.ccte.api.ccdapp2.domain.assaylist;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "assay-detail-short", types = {AssayListDetail.class})
public interface AssayListDetailShort {

    public String getEndpointName();

    public Double getAc50();

    public Integer getHitc();

    public Double getLogAc50();

    public String getScaledTop();

    public Double getTop();
}
