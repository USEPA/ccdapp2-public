package gov.epa.ccte.api.ccdapp2.repository.exposure;

import gov.epa.ccte.api.ccdapp2.domain.exposure.DemographicExposurePrediction;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "DemographicExposurePrediction", itemResourceRel = "demographic-exposure-prediction", path = "demographic-exposure-prediction")
public interface DemographicExposurePredictionRepository extends MongoRepository<DemographicExposurePrediction, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    List<DemographicExposurePrediction> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends DemographicExposurePrediction> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends DemographicExposurePrediction> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends DemographicExposurePrediction> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends DemographicExposurePrediction> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(DemographicExposurePrediction productionVolume);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends DemographicExposurePrediction> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


