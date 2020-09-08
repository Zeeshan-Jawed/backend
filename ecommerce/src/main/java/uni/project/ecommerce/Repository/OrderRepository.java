package uni.project.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.project.ecommerce.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
