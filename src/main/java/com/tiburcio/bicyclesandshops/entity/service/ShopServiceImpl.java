package com.tiburcio.bicyclesandshops.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.bicyclesandshops.entity.dao.IShopDao;
import com.tiburcio.bicyclesandshops.entity.models.Shop;

@Service
public class ShopServiceImpl implements IShopService{
	
	@Autowired
	private IShopDao shopDao;

	@Override
	public List<Shop> findAll() {
		return (List<Shop>) shopDao.findAll();
	}
	
	
}
