package gov.epa.ccte.api.ccdapp2.repository.exposure;

import gov.epa.ccte.api.ccdapp2.domain.exposure.ExposurePrediction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "exposurePrediction", itemResourceRel = "exposure-prediction", path = "exposure-prediction")
public interface ExposurePredictionRepository extends MongoRepository<ExposurePrediction, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ExposurePrediction> findBydtxsid(@Param("id") String dtxsid);

    // Disable deletion options from REST API

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposurePrediction> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposurePrediction> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposurePrediction> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExposurePrediction> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ExposurePrediction exposurePrediction);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ExposurePrediction> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}


