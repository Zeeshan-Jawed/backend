package uni.project.ecommerce.DTO;

import java.util.HashSet;
import java.util.Set;
public class AppUserDTO {
    private Long id;
    private String email;
    private String password;
    private String first_Name;
    private String last_Name;
    private Long contactNo;
    private String address;
    private Set<RoleDTO> roleDTOS=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<RoleDTO> getRoleDTOS() {
        return roleDTOS;
    }

    public void setRoleDTOS(Set<RoleDTO> roleDTOS) {
        this.roleDTOS = roleDTOS;
    }
}
