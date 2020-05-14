package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.AppUserDTO;
import uni.project.ecommerce.Model.AppUser;
import uni.project.ecommerce.Repository.AppUserRepository;
import uni.project.ecommerce.Service.AppUserService;

import java.util.HashSet;
import java.util.Set;
@Service
public class AppUserJpaService implements AppUserService {
    private final AppUserRepository appUserRepository;

    public AppUserJpaService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public Set<AppUser> findAll() {
        Set<AppUser> appUsers=new HashSet<>();
        appUserRepository.findAll().forEach(appUsers::add);
        return appUsers;
    }

    @Override
    public AppUser findById(Long aLong) {
        return appUserRepository.findById(aLong).orElse(null);
    }

    @Override
    public String save(AppUserDTO object) {
        AppUser appUser=new AppUser();
        appUser.setEmail(object.getEmail());
        appUser.setPassword(object.getPassword());
        appUser.setFirst_Name(object.getFirst_Name());
        appUser.setLast_Name(object.getLast_Name());
        appUser.setContactNo(object.getContactNo());
        appUser.setCity(object.getCity());
        appUser.setZip(object.getZip());
        appUser.setAddress(object.getAddress());
        appUser.setAddress2(object.getAddress2());
        appUser.setRegistationdate(object.getRegistationdate());
        appUserRepository.save(appUser);
        return "Record Saved Sucessfully";
    }


    @Override
    public String update(Long aLong,AppUserDTO object) {
        AppUser appUser=appUserRepository.findById(aLong).orElse(null);
        appUser.setEmail(object.getEmail());
        appUser.setPassword(object.getPassword());
        appUser.setFirst_Name(object.getFirst_Name());
        appUser.setLast_Name(object.getLast_Name());
        appUser.setContactNo(object.getContactNo());
        appUser.setCity(object.getCity());
        appUser.setZip(object.getZip());
        appUser.setAddress(object.getAddress());
        appUser.setAddress2(object.getAddress2());
        appUser.setRegistationdate(object.getRegistationdate());
        appUserRepository.save(appUser);
        return "Updated Sucessfully";
    }

    @Override
    public void delete(AppUser object) {

    }

    @Override
    public void deleteById(Long aLong) {
        appUserRepository.deleteById(aLong);
    }
}
