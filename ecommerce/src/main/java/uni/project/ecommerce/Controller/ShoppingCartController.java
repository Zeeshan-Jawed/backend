package uni.project.ecommerce.Controller;

import org.springframework.web.bind.annotation.*;
import uni.project.ecommerce.DTO.ProductDTO;
import uni.project.ecommerce.DTO.ShoppingCartDTO;
import uni.project.ecommerce.Model.ShoppingCart;
import uni.project.ecommerce.Service.ShoppingCartService;

import java.util.Set;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/cart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
    @GetMapping(value = "/")
    public Set<ShoppingCart> getid(){
        return  shoppingCartService.findAll();
    }
    @PostMapping(value = "/")
    public String cardId(@RequestBody ShoppingCartDTO shoppingCartDTO){
        return shoppingCartService.save(shoppingCartDTO);
    }
}
