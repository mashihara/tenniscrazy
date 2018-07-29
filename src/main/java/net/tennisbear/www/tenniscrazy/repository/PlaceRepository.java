package net.tennisbear.www.tenniscrazy.repository;

import net.tennisbear.www.tenniscrazy.domain.Place;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PlaceRepository extends PagingAndSortingRepository<Place, String> {
    List<Place> findAllBYPlaceName();
}
