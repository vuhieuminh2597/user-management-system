package com.exam.userms.repository;

import com.exam.userms.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT MAX(U.id) FROM User U")
    Long getLargestId ();
    @Query("SELECT U FROM User U ORDER BY U.id")
    Page<User> findAllUser(Pageable pageable);
}
