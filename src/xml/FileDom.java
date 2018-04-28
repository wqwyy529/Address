package xml;

import java.util.ArrayList;
import java.util.List;

import com.icss.addr.dto.City;
import com.icss.addr.dto.Country;
import com.icss.addr.dto.Province;

public class FileDom {
	 private static List<Province> allProvince;
	    
	    
	    static{
	    	if(allProvince == null){
	    		List<Province> proList = new ArrayList<Province>();
	    		
	    		Province bj = new Province();
	    		bj.setId("bj");
	    		bj.setName("北京");
	    		Country bj01 = new Country("bj01","东城区");
	    		Country bj02 = new Country("bj02","西城区");
	    		Country bj03 = new Country("bj03","崇文区");
	    		Country bj04 = new Country("bj04","宣武区");
	    		Country bj05 = new Country("bj05","朝阳区");
	    		Country bj06 = new Country("bj06","丰台区");
	    		Country bj07 = new Country("bj07","石景山区");
	    		Country bj08 = new Country("bj08","海淀区");
	    		Country bj09 = new Country("bj09","门头沟区");
	    		Country bj10 = new Country("bj10","房山区");
	    		Country bj11 = new Country("bj11","通州区");
	    		Country bj12 = new Country("bj12","顺义区");
	    		Country bj13 = new Country("bj13","昌平区");
	    		Country bj14 = new Country("bj14","大兴区");
	    		Country bj15 = new Country("bj15","怀柔区");
	    		Country bj16 = new Country("bj16","平谷区");
	    		Country bj17 = new Country("bj17","密云县");
	    		Country bj18 = new Country("bj18","延庆县");
	    		List<Country> qvList = new ArrayList<Country>(20);
	    		qvList.add(bj01);
	    		qvList.add(bj02);
	    		qvList.add(bj03);
	    		qvList.add(bj04);
	    		qvList.add(bj05);
	    		qvList.add(bj06);
	    		qvList.add(bj07);
	    		qvList.add(bj08);
	    		qvList.add(bj09);
	    		qvList.add(bj10);
	    		qvList.add(bj11);
	    		qvList.add(bj12);
	    		qvList.add(bj13);
	    		qvList.add(bj14);
	    		qvList.add(bj15);
	    		qvList.add(bj16);
	    		List<Country> xianList = new ArrayList<Country>(2);
	    		xianList.add(bj17);
	    		xianList.add(bj18);		
	    		City bjQv = new City();
	    		bjQv.setId("bjqv");
	    		bjQv.setName("北京辖区");
	    		bjQv.setCountryList(qvList);
	    		City bjxian = new City();
	    		bjxian.setId("bjxian");
	    		bjxian.setName("北京辖县");
	    		bjxian.setCountryList(xianList);
	    		List<City> bjXian = new ArrayList<City>();
	    		bjXian.add(bjQv);
	    		bjXian.add(bjxian);
	    		bj.setCityList(bjXian);	
	    		
	    		Province tj = new Province();
	    		tj.setId("tj");
	    		tj.setName("天津市");
	    		Country tj01 = new Country("tj01","和平区");
	    		Country tj02 = new Country("tj02","河东区");
	    		Country tj03 = new Country("tj03","河西区");
	    		Country tj04 = new Country("tj04","南开区");
	    		Country tj05 = new Country("tj05","河北区");
	    		Country tj06 = new Country("tj06","红桥区");
	    		Country tj07 = new Country("tj07","塘沽区");
	    		Country tj08 = new Country("tj08","汉沽区");
	    		Country tj09 = new Country("tj09","大港区");
	    		Country tj10 = new Country("tj10","东丽区");
	    		Country tj11 = new Country("tj11","西青区");
	    		Country tj12 = new Country("tj12","津南区");
	    		Country tj13 = new Country("tj13","北辰区");
	    		Country tj14 = new Country("tj14","武清区");
	    		Country tj15 = new Country("tj15","宝坻区");
	    		Country tj16 = new Country("tj16","宁河县");
	    		Country tj17 = new Country("tj17","静海县");
	    		Country tj18 = new Country("tj18","蓟县");
	    		List<Country> tjqvList = new ArrayList<Country>(20);
	    		tjqvList.add(tj01);
	    		tjqvList.add(tj02);
	    		tjqvList.add(tj03);
	    		tjqvList.add(tj04);
	    		tjqvList.add(tj05);
	    		tjqvList.add(tj06);
	    		tjqvList.add(tj07);
	    		tjqvList.add(tj08);
	    		tjqvList.add(tj09);
	    		tjqvList.add(tj10);
	    		tjqvList.add(tj11);
	    		tjqvList.add(tj12);
	    		tjqvList.add(tj13);
	    		tjqvList.add(tj14);
	    		tjqvList.add(tj15);
	    		List<Country> tjxianList = new ArrayList<Country>(20);
	    		tjxianList.add(tj16);
	    		tjxianList.add(tj17);
	    		tjxianList.add(tj18);
	    		City tjQv = new City();
	    		tjQv.setId("tjqv");
	    		tjQv.setName("天津辖区");
	    		tjQv.setCountryList(tjqvList);
	    		City tjxian = new City();
	    		tjxian.setId("tjxian");
	    		tjxian.setName("天津辖县");
	    		tjxian.setCountryList(tjxianList);
	    		List<City> tjcityList = new ArrayList<City>();
	    		tjcityList.add(tjQv);
	    		tjcityList.add(tjxian);
	    		tj.setCityList(tjcityList);
	    		
	    		
	    		
	    		proList.add(bj);
	    		proList.add(tj);	
	    		
	    		allProvince =  proList;
	    	}

	    }
	    
	    public List<Province> getAllProv(){
	    	return allProvince;
	    }
	    
	    public List<City> getAllCity(String proid){
	    	List<City> allCity = null;
	    	for(Province pro:allProvince){
	    		if(pro.getId().equals(proid)){
	    			allCity = pro.getCityList();
	    		}
	    	}
			return allCity ;
			
		}
		
		public List<Country> getAllCountry(String provid,String cityid){
			List<Country> allCountry = null;
	    	for(Province prov:allProvince){
	    		if(prov.getId().equals(provid)){
	    			List<City> allCity = prov.getCityList();
	    			for(City city:allCity){
	    				if(city.getId().equals(cityid)){
	    					allCountry = city.getCountryList();
	    				}
	    			}
	    		}
	    	}
			return allCountry ;
			
		}
}
