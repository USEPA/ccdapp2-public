package gov.epa.ccte.api.ccdapp2.repository.httr;

import gov.epa.ccte.api.ccdapp2.domain.httr.HttrCitations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Citations", itemResourceRel = "httr-citations", path = "httr-citations")
public interface HttrCitationsRepository extends MongoRepository<HttrCitations, String> {

    @RestResource(path = "by-dataset", rel = "find-by-dataset", exported = true)
    List<HttrCitations> findByDataset(@Param("dataset") String dataset);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HttrCitations> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HttrCitations> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(HttrCitations entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends HttrCitations> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}