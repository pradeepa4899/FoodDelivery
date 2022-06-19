package com.springbootweb.repository;
import java.util.ArrayList;



import
org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootweb.model.Food;


public interface FoodRepository extends JpaRepository<Food, Integer>{


	

}
	

