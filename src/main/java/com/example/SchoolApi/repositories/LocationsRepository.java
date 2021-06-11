package com.example.SchoolApi.repositories;

import com.example.SchoolApi.model.Course;
import com.example.SchoolApi.model.OSMFilteredLocations;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "osmfilteredlocations",path = "locations")
public interface LocationsRepository extends PagingAndSortingRepository<OSMFilteredLocations,Long> {
}
