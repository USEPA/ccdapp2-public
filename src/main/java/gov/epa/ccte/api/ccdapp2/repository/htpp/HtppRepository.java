package gov.epa.ccte.api.ccdapp2.repository.htpp;

import gov.epa.ccte.api.ccdapp2.domain.htpp.Htpp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Htpp", itemResourceRel = "htpp", path = "htpp")
public interface HtppRepository extends MongoRepository<Htpp, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    List<Htpp> findBydtxsid(@Param("id") String dtxsid);

    List<Htpp> findBySampleIdAndCategoryName(String sampleId, String categoryName);


    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Htpp> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Htpp> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(Htpp entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Htpp> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}