package uni.project.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.project.ecommerce.Model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
