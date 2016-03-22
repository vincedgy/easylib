package net.vincedgy.library.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vincent on 21/03/2016.
 */

@RepositoryRestResource(path = "paramColumns")
public interface ParameterColumnRepository
        extends JpaRepository<ParameterColumn, ParameterColumnPK> {
}

