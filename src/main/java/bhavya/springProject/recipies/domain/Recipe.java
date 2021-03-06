package bhavya.springProject.recipies.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by barora on 1/8/2018.
 */
@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	private String description;
	private Integer propTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String directions;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
	private Set<Ingredient> ingregient;
	
	@Lob
	private Byte[] image;
	
	@Enumerated(value = EnumType.STRING)
	private Difficulty difficulty;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Notes notes;
	
	@ManyToMany
	@JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories;
	
	public Set<Category> getCategories() {
		return categories;
	}
	
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	public Set<Ingredient> getIngregient() {
		return ingregient;
	}
	
	public void setIngregient(Set<Ingredient> ingregient) {
		this.ingregient = ingregient;
	}
	
	public Difficulty getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getPropTime() {
		return propTime;
	}
	
	public void setPropTime(Integer propTime) {
		this.propTime = propTime;
	}
	
	public Integer getCookTime() {
		return cookTime;
	}
	
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	
	public Integer getServings() {
		return servings;
	}
	
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getDirections() {
		return directions;
	}
	
	public void setDirections(String directions) {
		this.directions = directions;
	}
	
	public Byte[] getImage() {
		return image;
	}
	
	public void setImage(Byte[] image) {
		this.image = image;
	}
	
	public Notes getNotes() {
		return notes;
	}
	
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
}
