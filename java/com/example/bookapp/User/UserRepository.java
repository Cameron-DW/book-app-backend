package com.example.bookapp.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(
            value = "SELECT * FROM tbl_user s WHERE s.email = :email AND s.password = :password",
            nativeQuery = true
    )
    Optional<User> getUserByEmailAndPassword(String email, String password);

    @Query(
            value = "SELECT * FROM tbl_user s WHERE s.user_id = :userId",
            nativeQuery = true
    )
    User getUserByUserId(Long userId);

}
