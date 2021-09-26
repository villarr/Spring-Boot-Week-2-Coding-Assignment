package com.promineotech.jeep.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.promineotech.entity.Jeeps;

@Service
public class DefaultJeepSalesService implements JeepSalesService {
	Logger logged = LoggerFactory.getLogger(DefaultJeepSalesService.class);
	@Override
	public List<Jeeps> fetchJeeps(String model, String trim) {
		logged.info("The fetchJeeps method was called with model = {} "
				+ "and trim = {}", model, trim);
		
		return null;
	}

}
