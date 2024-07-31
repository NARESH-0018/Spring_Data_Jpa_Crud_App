package in.naresh.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.naresh.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
  
	@Query (value = "select * from Hopital_Tble_Info", nativeQuery = true)
	public List<Hospital> m1();
	
	
	
	
	
	/*
	 * public List<Hospital> findByHospitalPriceGreaterThan(Double hospitalPrice);
	 * 
	 * public List<Hospital> findByHospitalPriceLessThan(Double hospitalPrice);
	 * 
	 * public List<Hospital> findByHospitalName(String hospitalName);
	 */
}
