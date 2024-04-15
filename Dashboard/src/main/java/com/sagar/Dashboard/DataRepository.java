package com.sagar.Dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DataRepository extends JpaRepository<Data, Long > {

	List<Data> findByEndYear(int endYear);
	List<Data> findByTopic(String topic);
	 List<Data> findBySector(String sector);
	 List<Data> findByRegion(String region);
	    
	    List<Data> findByPestle(String pestle);
	    
	    List<Data> findBySource(String source);
	    
	    List<Data> findBySwot(String swot);
	    
	    List<Data> findByCountry(String country);
	    
	    List<Data> findByCity(String city);

}