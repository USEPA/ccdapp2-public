package gov.epa.ccte.api.ccdapp2.repository.executivesummary;

import gov.epa.ccte.api.ccdapp2.domain.executivesummary.ExecutiveSummaryPod;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ExecutiveSummaryPod", itemResourceRel = "ExecutiveSummaryPod", path = "executive-summary-pod")
public interface ExecutiveSummaryPodRepository extends MongoRepository<ExecutiveSummaryPod, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    List<ExecutiveSummaryPod> findBydtxsid(@Param("id") String dtxsid);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryPod> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryPod> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryPod> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryPod> S save(S entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ExecutiveSummaryPod entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ExecutiveSummaryPod> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}

