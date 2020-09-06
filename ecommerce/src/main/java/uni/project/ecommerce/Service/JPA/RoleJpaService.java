package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.RoleDTO;
import uni.project.ecommerce.Model.Role;
import uni.project.ecommerce.Repository.RoleRepository;
import uni.project.ecommerce.Service.RoleService;

import java.util.HashSet;
import java.util.Set;
@Service
public class RoleJpaService implements RoleService {
    private final RoleRepository roleRepository;

    public RoleJpaService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Set<Role> findAll() {
        Set<Role> roles=new HashSet<>();
        roleRepository.findAll().forEach(roles::add);
        return roles;
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
