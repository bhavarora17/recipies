package bhavya.springProject.recipies.repositories;

import bhavya.springProject.recipies.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

/**
 * Created by barora on 1/10/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
	Optional<Category> findByDescription(String string);
}
