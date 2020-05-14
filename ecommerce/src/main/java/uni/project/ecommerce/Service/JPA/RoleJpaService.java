package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.RoleDTO;
import uni.project.ecommerce.Model.Role;
import uni.project.ecommerce.Service.RoleService;

import java.util.Set;
@Service
public class RoleJpaService implements RoleService {
    @Override
    public Set<Role> findAll() {
        return null;
    }

    @Override
    public Role findById(Long aLong) {
        return null;
    }

    @Override
    public String save(RoleDTO object) {
        return null;
    }

    @Override
    public String update(Long aLong, RoleDTO object) {
        return null;
    }

    @Override
    public void delete(Role object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
