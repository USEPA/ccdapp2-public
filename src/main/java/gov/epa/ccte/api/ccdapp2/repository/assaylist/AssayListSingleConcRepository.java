package gov.epa.ccte.api.ccdapp2.repository.assaylist;

import gov.epa.ccte.api.ccdapp2.domain.assaylist.AssayListSingleConc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "assayListSingleConc", itemResourceRel = "assay-list-single-conc", path = "assay-list-single-conc")
public interface AssayListSingleConcRepository extends MongoRepository<AssayListSingleConc, String> {

    @RestResource(path = "by-endpointname", rel = "find-by-endpointname", exported = true)
    Optional<Page<AssayListSingleConc>>findByEndpointName(@Param("name") String endpointName, Pageable pageable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayListSingleConc> S save(S entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(AssayListSingleConc entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends AssayListSingleConc> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
