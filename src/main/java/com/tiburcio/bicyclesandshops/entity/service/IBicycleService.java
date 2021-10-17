package com.tiburcio.bicyclesandshops.entity.service;

import java.util.List;

import com.tiburcio.bicyclesandshops.entity.models.Bicycle;

public interface IBicycleService {
	List<Bicycle> findAll();
	List<Bicycle> findAllByModel(String model);
	List<Bicycle> findAllFromCity(String city);
}
