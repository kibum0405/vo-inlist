package voinlist.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import voinlist.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "inLists", path = "inLists")
public interface InListRepository
    extends PagingAndSortingRepository<InList, Long> {}
