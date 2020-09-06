package uni.project.ecommerce.Controller;

import org.springframework.web.bind.annotation.*;
import uni.project.ecommerce.DTO.CategoryDTO;
import uni.project.ecommerce.DTO.ProductDTO;
import uni.project.ecommerce.Model.Category;
import uni.project.ecommerce.Model.Product;
import uni.project.ecommerce.Service.ProductService;

import java.util.Set;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "/")
    public String saveProduct(@RequestBody ProductDTO productDTO){
        return productService.save(productDTO);
    }
    @GetMapping(value="/")
    public Set<Product> getProduct(){
        return productService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.findById(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteProductById(@PathVariable("id") Long id){
        productService.deleteById(id);
        return "Deleted";
    }
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable("id") Long id , @RequestBody ProductDTO productDTO ){
        return productService.update(id ,productDTO);
    }
}
