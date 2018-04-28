package com.icss.addr.biz;

import java.util.List;

import com.icss.addr.dao.AddrDao;
import com.icss.addr.dto.City;
import com.icss.addr.dto.Country;
import com.icss.addr.dto.Province;

public class AddrBiz {
	public List<Province> getAllProv(){
		AddrDao dao = new AddrDao();
		return dao.getAllProv();
		
	}
	
	public List<City> getAllCity(String proid){
		return null;
		
	}
	
	public List<Country> getAllCountry(String cityid){
		return null;
		
	}
}
