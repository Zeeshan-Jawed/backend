package uni.project.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.project.ecommerce.Model.AppUser;
import uni.project.ecommerce.Model.Category;

import java.util.Optional;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
