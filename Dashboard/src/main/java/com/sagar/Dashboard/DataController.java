package com.sagar.Dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api")

public class DataController {
	
	@Autowired
	private DataService dataservice;
	
	
	@RequestMapping("data")
	public List<Data> getalltopics() {
		return dataservice.getAllData();
		
	}
	    
	    @GetMapping("/dataByEndYear")
	    public List<Data> getDataByEndYear (@RequestParam int endYear) {
	        return dataservice.getDataByEndYear(endYear);
	    }

	    
	    @GetMapping("/dataByTopic")
	    public List<Data> getDataByTopic (@RequestParam String topic) {
	        return dataservice.getDataByTopic(topic);
	    }

	    
	    @GetMapping("/dataBySector")
	    public List<Data> getDataBySector (@RequestParam String sector) {
	        return dataservice.getDataBySector(sector);
	    }
       
	    @GetMapping("/dataByRegion")
		public List<Data> getDataByRegion(@RequestParam String region) {
		    return dataservice.getDataByRegion(region);
		}
		
		@GetMapping("/dataByPest")
		public List<Data> getDataByPest(@RequestParam String pestle) {
		    return dataservice.getDataByPestle(pestle);
		}
		
		@GetMapping("/dataBySource")
		public List<Data> getDataBySource(@RequestParam String source) {
		    return dataservice.getDataBySource(source);
		}
		
		@GetMapping("/dataBySwot")
		public List<Data> getDataBySwot(@RequestParam String swot) {
		    return dataservice.getDataBySwot(swot);
		}
		
		@GetMapping("/dataByCountry")
		public List<Data> getDataByCountry(@RequestParam String country) {
		    return dataservice.getDataByCountry(country);
		}
		
		@GetMapping("/dataByCity")
		public List<Data> getDataByCity(@RequestParam String city) {
		    return dataservice.getDataByCity(city);
		}
		
		
		
		


}

