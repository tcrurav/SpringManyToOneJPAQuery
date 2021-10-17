package com.tiburcio.bicyclesandshops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.bicyclesandshops.entity.models.Bicycle;
import com.tiburcio.bicyclesandshops.entity.service.IBicycleService;

@RestController
public class BicycleController {
	
	@Autowired
	private IBicycleService bicycleService;

	@GetMapping(path = "/bicycles")
	private List<Bicycle> findAll(){
		return bicycleService.findAll();
	}
	
	@GetMapping(path = "/bicycles/model/{model}")
	private List<Bicycle> findAllByModel(@PathVariable("model") String model){
		System.out.println(model);
		return bicycleService.findAllByModel(model);
	}
	
	@GetMapping(path = "/bicycles/city/{city}")
	private List<Bicycle> findAllFromCity(@PathVariable("city") String city){
		System.out.println(city);
		return bicycleService.findAllFromCity(city);
	}
}
