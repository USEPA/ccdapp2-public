package gov.epa.ccte.api.ccdapp2.repository;


import gov.epa.ccte.api.ccdapp2.domain.chemicalsynonym.ChemicalSynonym;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "chemicalSynonym", itemResourceRel = "chemical-synonym", path = "chemical-synonym")
public interface ChemicalSynonymRepository extends MongoRepository<ChemicalSynonym, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ChemicalSynonym> findBydtxsid(@Param("id") String dtxsid);

    @RestResource(path = "by-dtxcid", rel = "find-by-dtxcid", exported = true)
    Optional<ChemicalSynonym> findBydtxcid(@Param("id") String dtxcid);

    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalSynonym> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalSynonym> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalSynonym> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalSynonym> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ChemicalSynonym chemicalSynonym);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ChemicalSynonym> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


