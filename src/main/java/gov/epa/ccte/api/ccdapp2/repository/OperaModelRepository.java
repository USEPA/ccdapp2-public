package gov.epa.ccte.api.ccdapp2.repository;


import gov.epa.ccte.api.ccdapp2.domain.opera.OperaModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "OperaModel", itemResourceRel = "opera-model", path = "opera-model")
public interface OperaModelRepository extends MongoRepository<OperaModel, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    List<OperaModel> findBydtxsid(@Param("id") String dtxsid);

    @RestResource(path = "by-dtxsid-modelid", rel = "find-by-dtxsid-modelid", exported = true)
    OperaModel findByDtxsidAndModelId(@Param("dtxsid") String dtxsid, @Param("modelid") int modelId);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends OperaModel> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends OperaModel> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(OperaModel entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends OperaModel> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}