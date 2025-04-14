package gov.epa.ccte.api.ccdapp2.repository.chemicallist;


import gov.epa.ccte.api.ccdapp2.domain.chemicallist.ChemicalListDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "chemicalListDetails", itemResourceRel = "chemical-list-detail", path = "chemical-list-details")
public interface ChemicalListlDetailRepository extends MongoRepository<ChemicalListDetail, String> {

    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<ArrayList<ChemicalListDetail>> findBydtxsid(@Param("id") String dtxsid);

    @RestResource(path = "by-listname", rel = "find-by-listname", exported = true)
    //@Query("{ 'listName' : { '$regex' : ?0 , $options: 'i'}}")
    Optional<Page<ChemicalListDetail>> findByListNameEqualsIgnoreCase(@Param("name") String listName, Pageable pageable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalListDetail> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalListDetail> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalListDetail> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends ChemicalListDetail> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(ChemicalListDetail listDetail);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ChemicalListDetail> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
