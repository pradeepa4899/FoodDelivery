package com.springbootweb.controller;
import java.util.ArrayList;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import
org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import
org.springframework.web.bind.annotation.RestController;

import com.springbootweb.model.Food;

import com.springbootweb.service.FoodService;







@RestController
public class FoodController {
	  @Autowired
	  
    private FoodService foodService;
	
	  @GetMapping("/findall")
		public ArrayList<Food> getAllFood() {
		return foodService.findAllFood();
		}
	  
	  @GetMapping("/findbyid/{id}")
	  public Food geFoodUsingId(@PathVariable Integer id) {
	  return foodService.findAllFoodByID(id);
	  }

	  
	

}





