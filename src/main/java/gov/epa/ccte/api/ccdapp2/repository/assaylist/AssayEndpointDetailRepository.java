package gov.epa.ccte.api.ccdapp2.repository.assaylist;


import gov.epa.ccte.api.ccdapp2.domain.assaylist.AssayDetailShort;
import gov.epa.ccte.api.ccdapp2.domain.assaylist.AssayEndpointDetail;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "assayEndpointDetail", itemResourceRel = "assay-endpoint-detail", path = "assay-endpoint-detail")
public interface AssayEndpointDetailRepository extends MongoRepository<AssayEndpointDetail, String> {


    @RestResource(path = "by-endpointname", rel = "find-by-assay-endpoint-name", exported = true)
    Optional<AssayEndpointDetail> findByAssayComponentEndpointName(@Param("name") String assayComponentEndpointName);

    List<AssayDetailShort> findAllByAssayComponentEndpointNameIn(List<String> assayComponentEndpointNames);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayEndpointDetail> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayEndpointDetail> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(AssayEndpointDetail entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends AssayEndpointDetail> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


