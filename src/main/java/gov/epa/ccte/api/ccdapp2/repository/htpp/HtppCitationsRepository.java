package gov.epa.ccte.api.ccdapp2.repository.htpp;

import gov.epa.ccte.api.ccdapp2.domain.htpp.HtppCitations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Citations", itemResourceRel = "htpp-citations", path = "htpp-citations")
public interface HtppCitationsRepository extends MongoRepository<HtppCitations, String> {

    @RestResource(path = "by-dataset", rel = "find-by-dataset", exported = true)
    List<HtppCitations> findByDataset(@Param("dataset") String dataset);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HtppCitations> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HtppCitations> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(HtppCitations entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends HtppCitations> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}