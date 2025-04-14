package gov.epa.ccte.api.ccdapp2.repository.executivesummary;

import gov.epa.ccte.api.ccdapp2.domain.executivesummary.ExecutiveSummaryLinks;
import gov.epa.ccte.api.ccdapp2.domain.executivesummary.Physchem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ExecutiveSummaryLinks", itemResourceRel = "ExecutiveSummaryLinks", path = "executive-summary-links")
public interface ExecutiveSummaryLinksRepository  extends MongoRepository<ExecutiveSummaryLinks, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ExecutiveSummaryLinks> findBydtxsid(@Param("id") String dtxsid);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryLinks> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryLinks> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryLinks> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryLinks> S save(S entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ExecutiveSummaryLinks entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ExecutiveSummaryLinks> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
