package com.tagit.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tagit.model.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Long>{

}
