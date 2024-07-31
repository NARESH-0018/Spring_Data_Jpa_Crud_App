package in.naresh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Hopital_Tble_Info")
public class Hospital {
	
	@Id
     private Integer hospitalId;
     private String hospitalName;
     private String hospitalLocation;
     private Double hospitalPrice;
     
}
