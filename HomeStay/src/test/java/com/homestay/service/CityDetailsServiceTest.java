package com.homestay.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;


import org.junit.Test;


import com.homestay.dao.IHomeDAO;

public class CityDetailsServiceTest {

	@Test
	public void GetCity_Test() {
		IHomeDAO home= mock(IHomeDAO.class);
		ArrayList<String> cities= new ArrayList<>();
		cities.add("Charlotte");
		cities.add("San Jose");
	
		when(home.getCity()).thenReturn(cities);
		ArrayList<String> testedCities = home.getCity();
		assertEquals(2, testedCities.size());
	}
	
	@Test
	public void GetCity_Test2() {
		IHomeDAO home= mock(IHomeDAO.class);
		ArrayList<String> cities= new ArrayList<>();
	
		when(home.getCity()).thenReturn(cities);
		ArrayList<String> testedCities = home.getCity();
		assertEquals(0, testedCities.size());
	}

}
