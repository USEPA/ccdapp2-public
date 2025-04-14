package gov.epa.ccte.api.ccdapp2.repository.chemicallist;

import gov.epa.ccte.api.ccdapp2.domain.chemicallist.ChemicalList;
import org.springframework.data.mongodb.repository.Query;
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
@RepositoryRestResource(collectionResourceRel = "chemicalLists", itemResourceRel = "chemical-list", path = "chemical-lists")
//public interface ChemicalListRepository extends MongoRepository<ChemicalList, String> {
// we have to switch to CrudRepository from MongoRepository to avoid paging
public interface ChemicalListRepository extends CrudRepository<ChemicalList, String> {


    @RestResource(path = "by-name", rel = "find-by-name", exported = true)
    Optional<ChemicalList> findByName(@Param("name") String name);

    @RestResource(path = "all-by-name",rel = "all-by-name",exported = true)
    List<ChemicalList> findAllByOrderByNameAsc();

    @RestResource(path = "count", rel = "find-total-records", exported = true)
    @Query(value = "{name: {$exists:true}}",count = true)
    Long getListCount();

    // Disable deletion options from REST API
    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalList> S save(S entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalList> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ChemicalList entity);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ChemicalList> entities);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
