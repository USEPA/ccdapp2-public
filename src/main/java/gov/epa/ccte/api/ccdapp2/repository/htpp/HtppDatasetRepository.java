package gov.epa.ccte.api.ccdapp2.repository.htpp;

import gov.epa.ccte.api.ccdapp2.domain.htpp.HtppDataset;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "HtppDataset", itemResourceRel = "htpp-dataset", path = "htpp-dataset")
public interface HtppDatasetRepository extends MongoRepository<HtppDataset, String> {

    @RestResource(path = "by-dataset", rel = "find-by-dataset", exported = true)
    List<HtppDataset> findByDataset(@Param("dataset") String dataset);



    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HtppDataset> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HtppDataset> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(HtppDataset entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends HtppDataset> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}