package gov.epa.ccte.api.ccdapp2.repository.assaylist;


import gov.epa.ccte.api.ccdapp2.domain.assaylist.AssayListDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "assayListDetails", itemResourceRel = "assay-list-detail", path = "assay-list-details")
public interface AssayListlDetailRepository extends MongoRepository<AssayListDetail, String> {


    @RestResource(path = "by-dtxsid", rel = "find-by-dtxsid", exported = true)
    Optional<List<AssayListDetail>> findBydtxsidOrderByEndpointName(@Param("id") String dtxsid);

/*
    @RestResource(path = "by-endpointname", rel = "find-by-endpointname", exported = true)
    Optional<Page<ListDetail>> findByEndpointName(@Param("name") String endpointName, Pageable pageable);
*/

    @RestResource(path = "by-endpointname", rel = "find-by-endpointname", exported = true)
    Optional<Page<AssayListDetail>> findByEndpointName(@Param("name") String endpointName, Pageable pageable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayListDetail> List<S> saveAll(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayListDetail> S insert(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayListDetail> List<S> insert(Iterable<S> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    <S extends AssayListDetail> S save(S s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @Hidden
    @RestResource(exported = false)
    void delete(AssayListDetail listDetail);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends AssayListDetail> iterable);

    @Override
    @Hidden
    @RestResource(exported = false)
    void deleteAll();
}
