package com.Techment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Techment.dao.IHotDrink;
import com.Techment.dao.ISoftDrink;
import com.Techment.dao.Mazza;
import com.Techment.dao.coffee;
import com.Techment.dao.tea;

@Service
public class Restaurant {

	@Autowired
	@Qualifier("tea")
	IHotDrink hotDrink;
	@Autowired
	@Qualifier("mazza")
	ISoftDrink softDrink;
	public void MenuRestaurantDisplay() {
		hotDrink.drink();
		softDrink.drink();
		
	}
	
	
	
}
