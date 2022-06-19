package com.springbootweb.service;
import java.util.ArrayList;





import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import
org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootweb.model.Food;
import com.springbootweb.repository.FoodRepository;




	@Service
	public class  FoodService {
			@Autowired
			FoodRepository foodRepository;
			
			public ArrayList<Food>findAllFood() {
			return (ArrayList<Food>)
			foodRepository.findAll();
			}
			
			public Food findAllFoodByID(Integer id) {
			Optional<Food> opt = foodRepository.findById(id);
			if (opt.isPresent())
			return opt.get();
			else
			return null;
			}


		}
