package com.Foodbox.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Foodbox.Entity.CartEntity;

@Repository
public interface CartRepository extends CrudRepository<CartEntity, Long> {

	public List<CartEntity> findAllByUserId(Long id);


}