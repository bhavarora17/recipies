package bhavya.springProject.recipies.repositories;

import bhavya.springProject.recipies.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by barora on 1/10/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
