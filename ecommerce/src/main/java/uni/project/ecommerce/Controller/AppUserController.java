package uni.project.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.project.ecommerce.DTO.AppUserDTO;
import uni.project.ecommerce.Model.AppUser;
import uni.project.ecommerce.Service.AppUserService;
import uni.project.ecommerce.Service.JPA.AppUserJpaService;

import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/appUser")
public class AppUserController {
    private final AppUserService appUserService;
    @Autowired
    private AppUserJpaService appUserJpaService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
    @PostMapping(value = "/")
    public String saveAppUser(@RequestBody AppUserDTO appUserDTO){
        return appUserService.save(appUserDTO);
    }

    @GetMapping(value="/")
    public Set<AppUser> getAppUser(){
        return appUserService.findAll();
    }
    @GetMapping(value = "/{id}")
    public AppUser getAppUserById(@PathVariable("id") Long id){
        return appUserService.findById(id);

    }
    @GetMapping(value = "/e/{email}")
    public Optional<AppUser> getAppUserByemail(@PathVariable("email") String email){
        return appUserService.findByemail(email);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteAppUserById(@PathVariable("id") Long id){
          appUserService.deleteById(id);
          return "Deleted";
    }
    @PutMapping("/{id}")
    public String updateAppUser(@PathVariable("id") Long id ,@RequestBody AppUserDTO appUserDTO ){
        return appUserService.update(id ,appUserDTO);
    }
}
