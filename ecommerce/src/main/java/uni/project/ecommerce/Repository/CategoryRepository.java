package uni.project.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.project.ecommerce.Model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
