package gov.epa.ccte.api.ccdapp2.repository.exposure;

import gov.epa.ccte.api.ccdapp2.domain.exposure.ExposureToxicInventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ExposureToxicInventory", itemResourceRel = "exposure-toxic-inventory", path = "exposure-toxic-inventory")
public interface ExposureToxicInventoryRepository extends MongoRepository<ExposureToxicInventory, String> {


    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ExposureToxicInventory> findBydtxsid(@Param("id") String dtxsid);
//
//    @RestResource(path = "by-dsstoxcid", rel = "find-by-dsstoxcid", exported = true)
//    Optional<ExposureToxicInventory> findByDsstoxCompoundId( @Param("id") String id);


    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureToxicInventory> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureToxicInventory> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureToxicInventory> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureToxicInventory> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ExposureToxicInventory ExposureToxicInventory);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ExposureToxicInventory> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


