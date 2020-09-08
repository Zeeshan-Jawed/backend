package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.ProductDTO;
import uni.project.ecommerce.Model.Product;
import uni.project.ecommerce.Repository.ProductRepository;
import uni.project.ecommerce.Service.ProductService;

import java.util.HashSet;
import java.util.Set;
@Service
public class ProductJpaService implements ProductService {
    private  final ProductRepository productRepository;

    public ProductJpaService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Set<Product> findAll() {
        Set<Product> products=new HashSet<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product findById(Long aLong) {
        return productRepository.findById(aLong).orElse(null);
    }

    @Override
    public String save(ProductDTO object) {
        Product product=new Product();
        product.setCategory(object.getCategory());
        product.setName(object.getName());
        product.setImage(object.getImage());
        product.setPrice(object.getPrice());
         productRepository.save(product);
        return "Record Saved Successfully";
    }

    @Override
    public String update(Long aLong, ProductDTO object) {
        Product product=productRepository.findById(aLong).orElse(null);
        product.setCategory(object.getCategory());
        product.setName(object.getName());
        product.setImage(object.getImage());
        product.setPrice(object.getPrice());
        productRepository.save(product);
        return "Record Saved Successfully";
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }
}
