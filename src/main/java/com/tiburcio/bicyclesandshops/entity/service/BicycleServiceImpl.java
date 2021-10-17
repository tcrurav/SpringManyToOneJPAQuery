package com.tiburcio.bicyclesandshops.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.bicyclesandshops.entity.dao.IBicycleDao;
import com.tiburcio.bicyclesandshops.entity.models.Bicycle;

@Service
public class BicycleServiceImpl implements IBicycleService{
	
	@Autowired
	private IBicycleDao bicycleDao;

	@Override
	public List<Bicycle> findAll() {
		return (List<Bicycle>) bicycleDao.findAll();
	}

	@Override
	public List<Bicycle> findAllByModel(String model) {
		return bicycleDao.findAllByModel(model);
	}

	@Override
	public List<Bicycle> findAllFromCity(String city) {
		return bicycleDao.findAllFromCity(city);
	}

}
