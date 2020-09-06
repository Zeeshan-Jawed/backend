package uni.project.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import uni.project.ecommerce.Config.AuthRequest;
import uni.project.ecommerce.Config.JwtTokenUtil;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/auth")
public class AuthenticationController {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    @PostMapping(value = "/")
    public String generatetoken(@RequestBody AuthRequest authRequest) throws Exception {
        try{authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getEmail()
                        ,authRequest.getPassword())
        );}catch (Exception e){
            throw new Exception("Invaild Username and Password");
        }
        return jwtTokenUtil.generateToken(authRequest.getEmail());
    }
}
