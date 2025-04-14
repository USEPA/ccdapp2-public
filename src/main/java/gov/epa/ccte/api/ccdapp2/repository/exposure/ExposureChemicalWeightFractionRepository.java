package gov.epa.ccte.api.ccdapp2.repository.exposure;

import gov.epa.ccte.api.ccdapp2.domain.exposure.ExposureChemicalWeightFraction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ExposureChemicalWeightFraction", itemResourceRel = "exposure-chemical-weight-fraction", path = "exposure-chemical-weight-fraction")
public interface ExposureChemicalWeightFractionRepository extends MongoRepository<ExposureChemicalWeightFraction, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ExposureChemicalWeightFraction> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureChemicalWeightFraction> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureChemicalWeightFraction> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureChemicalWeightFraction> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposureChemicalWeightFraction> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ExposureChemicalWeightFraction productionVolume);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ExposureChemicalWeightFraction> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


