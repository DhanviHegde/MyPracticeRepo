package com.cognizant.jpa.repository;

import com.cognizant.jpa.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    // Query Method
    Country findByCode(String code);

    // JPQL Query
    @Query("SELECT c FROM Country c WHERE c.name = :name")
    List<Country> findByNameJPQL(@Param("name") String name);

    // Native Query
    @Query(value = "SELECT * FROM Country WHERE name = :name", nativeQuery = true)
    List<Country> findByNameNative(@Param("name") String name);
}
