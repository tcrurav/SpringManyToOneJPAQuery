package com.tiburcio.bicyclesandshops.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.bicyclesandshops.entity.models.Shop;

public interface IShopDao extends CrudRepository<Shop, Long> {

}
