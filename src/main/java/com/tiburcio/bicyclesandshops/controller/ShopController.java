package com.tiburcio.bicyclesandshops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.bicyclesandshops.entity.models.Shop;
import com.tiburcio.bicyclesandshops.entity.service.IShopService;

@RestController
public class ShopController {
	
	@Autowired
	private IShopService shopService;
	
	@GetMapping(path = "/shops")
	private List<Shop> findAll(){
		return shopService.findAll();
	}

}
