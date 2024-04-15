package com.sagar.Dashboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DataService {
	
	
	@Autowired
	private  DataRepository datarepository;
	
	public  List<Data> getAllData() {
		List<Data> data = new ArrayList<Data>();
        datarepository.findAll().forEach(data::add);
        return data;
    }
	
	public List<Data> getDataByEndYear(int endYear) {
        return datarepository.findByEndYear(endYear);
    }

    
    public List<Data> getDataByTopic(String topic) {
        return datarepository.findByTopic(topic);
    }

    
    public List<Data> getDataBySector(String sector) {
        return datarepository.findBySector(sector);
    }
    public List<Data> getDataByRegion(String region) {
	    return datarepository.findByRegion(region);
	}
	
	public List<Data> getDataByPestle(String pestle) {
	    return datarepository.findByPestle(pestle);
	}
	
	public List<Data> getDataBySource(String source) {
	    return datarepository.findBySource(source);
	}
	
	public List<Data> getDataBySwot(String swot) {
	    return datarepository.findBySwot(swot);
	}
	
	public List<Data> getDataByCountry(String country) {
	    return datarepository.findByCountry(country);
	}
	
	public List<Data> getDataByCity(String city) {
	    return datarepository.findByCity(city);
	}
}

    