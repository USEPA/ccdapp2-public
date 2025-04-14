package gov.epa.ccte.api.ccdapp2.repository.executivesummary;

import gov.epa.ccte.api.ccdapp2.domain.executivesummary.ExecutiveSummaryDeepLink;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ExecutiveSummaryDeepLink", itemResourceRel = "ExecutiveSummaryDeepLink", path = "executive-summary-deeplink")
public interface ExecutiveSummaryDeepLinkRepository  extends MongoRepository<ExecutiveSummaryDeepLink, String> {

    @RestResource(path = "by-deeplinkId", rel = "find-by-deeplinkId", exported = true)
    Optional<ExecutiveSummaryDeepLink> findByDeeplinkId(@Param("id") Integer deeplinkId);


    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryDeepLink> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryDeepLink> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryDeepLink> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ExecutiveSummaryDeepLink> S save(S entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ExecutiveSummaryDeepLink entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ExecutiveSummaryDeepLink> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
