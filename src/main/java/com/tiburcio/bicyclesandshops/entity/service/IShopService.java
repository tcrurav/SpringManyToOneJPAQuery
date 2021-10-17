package com.tiburcio.bicyclesandshops.entity.service;

import java.util.List;

import com.tiburcio.bicyclesandshops.entity.models.Shop;

public interface IShopService {
	List<Shop> findAll();
}
