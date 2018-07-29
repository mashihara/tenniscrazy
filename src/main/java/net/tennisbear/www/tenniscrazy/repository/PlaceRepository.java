package net.tennisbear.www.tenniscrazy.repository;

import net.tennisbear.www.tenniscrazy.domain.Place;
import net.tennisbear.www.tenniscrazy.domain.PlaceCustom;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = PlaceCustom.class)
public interface PlaceRepository extends PagingAndSortingRepository<Place, String> {
}
