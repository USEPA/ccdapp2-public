package gov.epa.ccte.api.ccdapp2.repository.assaylist;



import gov.epa.ccte.api.ccdapp2.domain.assaylist.AssayList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "assayLists", itemResourceRel = "assay-list", path = "assay-lists")
public interface AssayListRepository extends CrudRepository<AssayList, String> {

    @RestResource(path = "by-name", rel = "find-by-name", exported = true)
    Optional<AssayList> findByName(@Param("name") String name);

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayList> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayList> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(AssayList entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends AssayList> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
