package gov.epa.ccte.api.ccdapp2.repository.executivesummary;

import gov.epa.ccte.api.ccdapp2.domain.executivesummary.Physchem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Physchem", itemResourceRel = "Physchem", path = "physchem")
public interface PhyschemRepository extends MongoRepository<Physchem, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<Physchem> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Physchem> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Physchem> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(Physchem entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Physchem> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
