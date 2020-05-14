package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.CategoryDTO;
import uni.project.ecommerce.Model.Category;
import uni.project.ecommerce.Repository.CategoryRepository;
import uni.project.ecommerce.Service.CategoryService;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoryJpaService implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryJpaService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> findAll() {
        Set<Category> categories=new HashSet<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public Category findById(Long aLong) {
        return categoryRepository.findById(aLong).orElse(null);
    }

    @Override
    public String save(CategoryDTO object) {
        Category category=new Category();
        category.setName(object.getName());
        category.setImage(object.getImage());
        categoryRepository.save(category);
        return "Record Saved Successfully";
    }

    @Override
    public String update(Long aLong, CategoryDTO object) {
        return null;
    }

    @Override
    public void delete(Category object) {
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }
}
