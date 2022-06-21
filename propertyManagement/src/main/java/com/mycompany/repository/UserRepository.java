package com.mycompany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

}
