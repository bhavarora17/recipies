package bhavya.springProject.recipies.domain;

//import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 * Created by barora on 1/8/2018.
 */
@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Recipe recipe;
	
	@Lob
	private String recipeNotes;
	
	
}
