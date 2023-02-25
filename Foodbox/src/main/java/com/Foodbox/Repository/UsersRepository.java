package com.Foodbox.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Foodbox.Entity.UserEntity;

@Repository
public interface UsersRepository extends CrudRepository<UserEntity, Long>{

}