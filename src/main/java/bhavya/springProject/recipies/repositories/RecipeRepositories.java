package bhavya.springProject.recipies.repositories;

import bhavya.springProject.recipies.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by barora on 1/10/2018.
 */
public interface RecipeRepositories extends CrudRepository<Recipe, Long>{

}
