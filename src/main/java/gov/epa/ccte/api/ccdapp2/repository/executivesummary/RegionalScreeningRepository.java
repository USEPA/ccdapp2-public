package gov.epa.ccte.api.ccdapp2.repository.executivesummary;

import gov.epa.ccte.api.ccdapp2.domain.executivesummary.RegionalScreening;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "RegionalScreening", itemResourceRel = "RegionalScreening", path = "regional-screening")
public interface RegionalScreeningRepository extends MongoRepository<RegionalScreening, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<RegionalScreening> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends RegionalScreening> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends RegionalScreening> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(RegionalScreening entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends RegionalScreening> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}

