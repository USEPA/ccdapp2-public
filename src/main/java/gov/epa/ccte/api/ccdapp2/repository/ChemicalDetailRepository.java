package gov.epa.ccte.api.ccdapp2.repository;


import gov.epa.ccte.api.ccdapp2.domain.chemicaldetail.ChemicalDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ChemicalDetail", itemResourceRel = "chemical-detail", path = "chemical-detail")
public interface ChemicalDetailRepository extends MongoRepository<ChemicalDetail, String> {

/*
    @RestResource(path = "by-list", rel = "find-by-list-name", exported = true)
    Optional<ChemicalDetail> findByChemicalListSummaries_Name(@Param("name") String listName);
*/
    @RestResource(path = "by-dsstoxsid", rel = "find-by-dsstoxsid", exported = true)
    Optional<ChemicalDetail> findByDsstoxSubstanceId(@Param("id") String id);

    @RestResource(path = "by-dsstoxcid", rel = "find-by-dsstoxcid", exported = true)
    Optional<ChemicalDetail> findByDsstoxCompoundId( @Param("id") String id);


    @RestResource(path = "count", rel = "find-total-records", exported = true)
    @Query(value = "{dsstoxSubstanceId: {$exists:true}}",count = true)
    Long getChemicalDetailCount();
    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalDetail> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalDetail> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalDetail> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalDetail> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ChemicalDetail chemicalDetail);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ChemicalDetail> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
