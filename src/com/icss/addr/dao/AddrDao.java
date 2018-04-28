package com.icss.addr.dao;

import java.util.List;

import xml.FileDom;

import com.icss.addr.dto.City;
import com.icss.addr.dto.Country;
import com.icss.addr.dto.Province;

public class AddrDao {
	public List<Province> getAllProv(){
		FileDom prov = new FileDom();
		return prov.getAllProv();	 	
	}
	
	public List<City> getAllCity(String provid){
		FileDom allCity = new FileDom();
		
		return allCity.getAllCity(provid);
		
	}
	
	public List<Country> getAllCountry(String provid,String cityid){
		FileDom allCountry = new FileDom();
		return allCountry.getAllCountry(provid, cityid);
		
	}

}
