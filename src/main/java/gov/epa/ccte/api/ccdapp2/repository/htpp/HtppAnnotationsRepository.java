package gov.epa.ccte.api.ccdapp2.repository.htpp;

import gov.epa.ccte.api.ccdapp2.domain.htpp.HtppAnnotations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "HtppAnnotations", itemResourceRel = "htpp-annotations", path = "htpp-annotations")
public interface HtppAnnotationsRepository extends MongoRepository<HtppAnnotations, String> {

    @RestResource(path = "by-endpoint", rel = "find-by-endpoint", exported = true)
    List<HtppAnnotations> findByEndpoint(@Param("endpoint") String endpoint);



    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HtppAnnotations> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HtppAnnotations> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(HtppAnnotations entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends HtppAnnotations> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}