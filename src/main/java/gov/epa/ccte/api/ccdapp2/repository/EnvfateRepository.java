package gov.epa.ccte.api.ccdapp2.repository;


import gov.epa.ccte.api.ccdapp2.domain.envfate.Envfate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Envfate", itemResourceRel = "envfate", path = "envfate")
public interface EnvfateRepository extends MongoRepository<Envfate, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<Envfate> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Envfate> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Envfate> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(Envfate entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Envfate> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}