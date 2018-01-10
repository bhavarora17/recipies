package bhavya.springProject.recipies.controller;

import bhavya.springProject.recipies.domain.Category;
import bhavya.springProject.recipies.domain.UnitOfMeasure;
import bhavya.springProject.recipies.repositories.CategoryRepository;
import bhavya.springProject.recipies.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by barora on 1/8/2018.
 */
@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	@Autowired
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository){
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	@RequestMapping({"","/index","/"})
	public String getIndexPage(){
		
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Cat id is : " + categoryOptional.get().getId());
		System.out.println("UOM id is : " + unitOfMeasureOptional.get().getId());

		return "index";
	}
}
