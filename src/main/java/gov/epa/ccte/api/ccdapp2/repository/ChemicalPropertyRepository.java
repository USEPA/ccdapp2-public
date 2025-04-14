package gov.epa.ccte.api.ccdapp2.repository;

import gov.epa.ccte.api.ccdapp2.domain.chemicalproperty.ChemicalProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "chemicalproperties", itemResourceRel = "chemicalproperty", path = "chemical-property")
public interface ChemicalPropertyRepository extends MongoRepository<ChemicalProperty, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ChemicalProperty> findByDtxsid(@Param("id") String dtxsid);

    @RestResource(path = "by-dtxcid", rel = "find-by-dtxcid", exported = true)
    Optional<ChemicalProperty> findByDtxcid(@Param("id") String dtxcid);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalProperty> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalProperty> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ChemicalProperty entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ChemicalProperty> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
