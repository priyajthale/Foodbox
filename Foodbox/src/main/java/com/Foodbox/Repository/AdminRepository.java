package com.Foodbox.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Foodbox.Entity.AdminEntity;

@Repository
public interface AdminRepository extends CrudRepository<AdminEntity, Long>{

}