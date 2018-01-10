package bhavya.springProject.recipies.domain;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by barora on 1/8/2018.
 */
@Entity
public class UnitOfMeasure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String description;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
