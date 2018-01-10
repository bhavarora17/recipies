package bhavya.springProject.recipies.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * Created by barora on 1/9/2018.
 */
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	
	@ManyToMany(mappedBy = "categories")
	private Set<Recipe> recipies;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Set<Recipe> getRecipies() {
		return recipies;
	}
	
	public void setRecipies(Set<Recipe> recipies) {
		this.recipies = recipies;
	}
}
