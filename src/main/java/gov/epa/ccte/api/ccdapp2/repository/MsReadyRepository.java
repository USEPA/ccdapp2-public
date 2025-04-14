package gov.epa.ccte.api.ccdapp2.repository;


import gov.epa.ccte.api.ccdapp2.domain.msready.MsReady;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "msReady", itemResourceRel = "ms-ready", path = "ms-ready")
public interface MsReadyRepository extends MongoRepository<MsReady, String> {

    @RestResource(path = "by-dtxcid", rel = "find-by-dtxcid", exported = true)
    Optional<MsReady> findBydtxcid(@Param("id") String dtxcid);

    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends MsReady> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends MsReady> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends MsReady> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends MsReady> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(MsReady msReady);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends MsReady> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


