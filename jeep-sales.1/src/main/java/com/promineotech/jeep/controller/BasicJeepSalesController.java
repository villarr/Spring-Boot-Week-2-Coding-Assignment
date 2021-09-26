package com.promineotech.jeep.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.entity.Jeeps;
import com.promineotech.jeep.service.JeepSalesService;


@RestController
public class BasicJeepSalesController implements JeepSalesController{
	Logger logger = LoggerFactory.getLogger(BasicJeepSalesController.class);

	@Autowired
	private JeepSalesService jeepSalesService;
	@Override
	public List<Jeeps> fetchJeepList(String model, String trim) {
		logger.debug("model={}, trim={}", model, trim);
		return jeepSalesService.fetchJeeps(model, trim);
	}

}
