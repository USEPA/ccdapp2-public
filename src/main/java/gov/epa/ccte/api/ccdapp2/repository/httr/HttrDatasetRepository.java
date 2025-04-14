package gov.epa.ccte.api.ccdapp2.repository.httr;

import gov.epa.ccte.api.ccdapp2.domain.httr.HttrDataset;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "HttrDataset", itemResourceRel = "httr-dataset", path = "httr-dataset")
public interface HttrDatasetRepository extends MongoRepository<HttrDataset, String> {

    @RestResource(path = "by-dataset", rel = "find-by-dataset", exported = true)
    List<HttrDataset> findByDataset(@Param("dataset") String dataset);



    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HttrDataset> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends HttrDataset> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(HttrDataset entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends HttrDataset> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}