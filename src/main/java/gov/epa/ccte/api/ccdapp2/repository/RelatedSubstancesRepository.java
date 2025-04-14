package gov.epa.ccte.api.ccdapp2.repository;

import gov.epa.ccte.api.ccdapp2.domain.relatedsubstances.RelatedSubstances;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "relatedSubstances", itemResourceRel = "related-substances", path = "related-substances")
public interface RelatedSubstancesRepository extends MongoRepository<RelatedSubstances, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<RelatedSubstances> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends RelatedSubstances> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends RelatedSubstances> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends RelatedSubstances> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends RelatedSubstances> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(RelatedSubstances relatedSubstances);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends RelatedSubstances> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


