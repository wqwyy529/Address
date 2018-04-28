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
	    		bj.setName("����");
	    		Country bj01 = new Country("bj01","������");
	    		Country bj02 = new Country("bj02","������");
	    		Country bj03 = new Country("bj03","������");
	    		Country bj04 = new Country("bj04","������");
	    		Country bj05 = new Country("bj05","������");
	    		Country bj06 = new Country("bj06","��̨��");
	    		Country bj07 = new Country("bj07","ʯ��ɽ��");
	    		Country bj08 = new Country("bj08","������");
	    		Country bj09 = new Country("bj09","��ͷ����");
	    		Country bj10 = new Country("bj10","��ɽ��");
	    		Country bj11 = new Country("bj11","ͨ����");
	    		Country bj12 = new Country("bj12","˳����");
	    		Country bj13 = new Country("bj13","��ƽ��");
	    		Country bj14 = new Country("bj14","������");
	    		Country bj15 = new Country("bj15","������");
	    		Country bj16 = new Country("bj16","ƽ����");
	    		Country bj17 = new Country("bj17","������");
	    		Country bj18 = new Country("bj18","������");
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
	    		bjQv.setName("����Ͻ��");
	    		bjQv.setCountryList(qvList);
	    		City bjxian = new City();
	    		bjxian.setId("bjxian");
	    		bjxian.setName("����Ͻ��");
	    		bjxian.setCountryList(xianList);
	    		List<City> bjXian = new ArrayList<City>();
	    		bjXian.add(bjQv);
	    		bjXian.add(bjxian);
	    		bj.setCityList(bjXian);	
	    		
	    		Province tj = new Province();
	    		tj.setId("tj");
	    		tj.setName("�����");
	    		Country tj01 = new Country("tj01","��ƽ��");
	    		Country tj02 = new Country("tj02","�Ӷ���");
	    		Country tj03 = new Country("tj03","������");
	    		Country tj04 = new Country("tj04","�Ͽ���");
	    		Country tj05 = new Country("tj05","�ӱ���");
	    		Country tj06 = new Country("tj06","������");
	    		Country tj07 = new Country("tj07","������");
	    		Country tj08 = new Country("tj08","������");
	    		Country tj09 = new Country("tj09","�����");
	    		Country tj10 = new Country("tj10","������");
	    		Country tj11 = new Country("tj11","������");
	    		Country tj12 = new Country("tj12","������");
	    		Country tj13 = new Country("tj13","������");
	    		Country tj14 = new Country("tj14","������");
	    		Country tj15 = new Country("tj15","������");
	    		Country tj16 = new Country("tj16","������");
	    		Country tj17 = new Country("tj17","������");
	    		Country tj18 = new Country("tj18","����");
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
	    		tjQv.setName("���Ͻ��");
	    		tjQv.setCountryList(tjqvList);
	    		City tjxian = new City();
	    		tjxian.setId("tjxian");
	    		tjxian.setName("���Ͻ��");
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
