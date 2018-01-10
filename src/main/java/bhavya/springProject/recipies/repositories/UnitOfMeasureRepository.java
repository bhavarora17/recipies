package bhavya.springProject.recipies.repositories;

import bhavya.springProject.recipies.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

/**
 * Created by barora on 1/10/2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	
	Optional<UnitOfMeasure> findByDescription(String string);
	
}
