package in.naresh;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.naresh.entity.Hospital;
import in.naresh.repo.HospitalRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx = 
				SpringApplication.run(Application.class, args);
		
		HospitalRepository repo = cntx.getBean(HospitalRepository.class);
	   
		
		List<Hospital> hospitals = repo.m1();
		
		for(Hospital h : hospitals) {
			System.out.println(h);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
