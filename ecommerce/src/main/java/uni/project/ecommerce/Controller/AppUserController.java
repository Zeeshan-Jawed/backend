package uni.project.ecommerce.Controller;

import org.springframework.web.bind.annotation.*;
import uni.project.ecommerce.DTO.AppUserDTO;
import uni.project.ecommerce.Model.AppUser;
import uni.project.ecommerce.Service.AppUserService;

import java.util.Set;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/appUser")
public class AppUserController {
    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
    @PostMapping(value = "/")
    public String saveAppUSer(@RequestBody AppUserDTO appUserDTO){
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
