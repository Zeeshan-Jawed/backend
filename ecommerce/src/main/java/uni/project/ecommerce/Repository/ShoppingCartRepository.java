package uni.project.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.project.ecommerce.Model.ShoppingCart;
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
