package gov.epa.ccte.api.ccdapp2.repository;


import gov.epa.ccte.api.ccdapp2.domain.opera.OperaImage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "OperaImage", itemResourceRel = "opera-image", path = "opera-image")
public interface OperaImageRepository extends MongoRepository<OperaImage, String> {

    OperaImage findBydtxsidAndModelId(@Param("id") String dtxsid,@Param("modelId") int modelId);

    OperaImage findBydtxcidAndModelId(@Param("id") String dtxcid,@Param("modelId") int modelId);


    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends OperaImage> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends OperaImage> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(OperaImage entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends OperaImage> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}