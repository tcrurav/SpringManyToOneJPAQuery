package com.tiburcio.bicyclesandshops.entity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tiburcio.bicyclesandshops.entity.models.Bicycle;

public interface IBicycleDao extends CrudRepository<Bicycle, Long>{
	List<Bicycle> findAllByModel(String model);
	
	@Query("select b from Bicycle b where b.shop.city = :city")
	List<Bicycle> findAllFromCity(@Param("city") String city);
}
