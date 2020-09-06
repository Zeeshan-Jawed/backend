package uni.project.ecommerce.Service;

import uni.project.ecommerce.DTO.AppUserDTO;
import uni.project.ecommerce.Model.AppUser;

import java.util.Optional;

public interface AppUserService extends CrudService<AppUser,AppUserDTO,Long> {
    Optional<AppUser> findByemail(String email);
}
