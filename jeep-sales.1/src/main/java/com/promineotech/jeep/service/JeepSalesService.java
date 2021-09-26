package com.promineotech.jeep.service;

import java.util.List;

import com.promineotech.entity.Jeeps;

public interface JeepSalesService {

	List<Jeeps> fetchJeeps(String model, String trim);

}
