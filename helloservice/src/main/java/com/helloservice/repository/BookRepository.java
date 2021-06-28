package com.helloservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.helloservice.domain.MicroserviceFeginTest;


@Repository
public interface BookRepository extends JpaRepository<MicroserviceFeginTest, Long> {

//    @Query("FROM Book b WHERE b.title LIKE %:searchText% OR b.author LIKE %:searchText% OR b.language LIKE %:searchText% OR b.genre LIKE %:searchText% ORDER BY b.price ASC")
    List<MicroserviceFeginTest> findAll();
}
