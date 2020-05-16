package uni.project.ecommerce.Service.JPA;
import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.SubCategoryDTO;
import uni.project.ecommerce.Model.SubCategory;
import uni.project.ecommerce.Repository.SubCategoryRepository;
import uni.project.ecommerce.Service.SubCategoryService;

import java.util.HashSet;
import java.util.Set;
@Service
public class SubCategoryJpaService implements SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;

    public SubCategoryJpaService(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @Override
    public Set<SubCategory> findAll() {
        Set<SubCategory> categories=new HashSet<>();
        subCategoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public SubCategory findById(Long aLong) {
        return subCategoryRepository.findById(aLong).orElse(null);
    }

    @Override
    public String save(SubCategoryDTO object) {
        SubCategory subCategory=new SubCategory();
        subCategory.setCategory(object.getCategory());
        subCategory.setName(object.getName());
        subCategory.setImage(object.getImage());
        subCategoryRepository.save(subCategory);
        return "Record Saved Sucessfully";
    }

    @Override
    public String update(Long aLong, SubCategoryDTO object) {
        SubCategory subCategory=subCategoryRepository.findById(aLong).orElse(null);
        subCategory.setCategory(object.getCategory());
        subCategory.setName(object.getName());
        subCategory.setImage(object.getImage());
        subCategoryRepository.save(subCategory);
        return "Record Updated Sucessfully";
    }

    @Override
    public void delete(SubCategory object) {
        subCategoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        subCategoryRepository.deleteById(aLong);
    }
}

