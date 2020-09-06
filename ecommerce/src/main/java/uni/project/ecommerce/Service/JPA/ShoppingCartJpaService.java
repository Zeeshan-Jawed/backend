package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.ShoppingCartDTO;
import uni.project.ecommerce.Model.ShoppingCart;
import uni.project.ecommerce.Repository.ShoppingCartRepository;
import uni.project.ecommerce.Service.ShoppingCartService;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Service
public class ShoppingCartJpaService implements ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartJpaService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public Set<ShoppingCart> findAll() {
        Set<ShoppingCart>shoppingCarts=new HashSet<>();
        shoppingCartRepository.findAll().forEach(shoppingCarts::add);
        return shoppingCarts;
    }

    @Override
    public ShoppingCart findById(Long aLong) {
        return null;
    }

    @Override
    public String save(ShoppingCartDTO object) {

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setProduct(object.getProduct());
        shoppingCart.setDate(new Date());
        shoppingCartRepository.save(shoppingCart);
        return shoppingCart.toString();
    }
    @Override
    public String update(Long aLong, ShoppingCartDTO object) {
        return null;
    }

    @Override
    public void delete(ShoppingCart object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
