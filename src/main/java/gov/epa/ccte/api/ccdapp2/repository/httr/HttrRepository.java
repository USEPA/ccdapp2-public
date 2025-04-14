package gov.epa.ccte.api.ccdapp2.repository.httr;

import gov.epa.ccte.api.ccdapp2.domain.httr.Httr;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Httr", itemResourceRel = "httr", path = "httr")
public interface HttrRepository extends MongoRepository<Httr, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    List<Httr> findBydtxsid(@Param("id") String dtxsid);

    List<Httr> findByCellTypeAndSignatureAndSampleIdAndDataset(String cellType, String signature,String sampleId,String dataset);


    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Httr> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends Httr> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(Httr entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Httr> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}