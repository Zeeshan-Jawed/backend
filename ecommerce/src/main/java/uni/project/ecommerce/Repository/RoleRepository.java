package uni.project.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.project.ecommerce.Model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
