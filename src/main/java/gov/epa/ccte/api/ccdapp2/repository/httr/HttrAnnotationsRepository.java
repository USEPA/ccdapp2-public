package gov.epa.ccte.api.ccdapp2.repository.httr;

import gov.epa.ccte.api.ccdapp2.domain.httr.HttrAnnotations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "HttrAnnotations", itemResourceRel = "httr-annotations", path = "httr-annotations")
public interface HttrAnnotationsRepository extends MongoRepository<HttrAnnotations, String> {

    @RestResource(path = "by-signature", rel = "find-by-signature", exported = true)
    List<HttrAnnotations> findBySignature(@Param("signature") String signature);



    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HttrAnnotations> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HttrAnnotations> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(HttrAnnotations entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends HttrAnnotations> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}