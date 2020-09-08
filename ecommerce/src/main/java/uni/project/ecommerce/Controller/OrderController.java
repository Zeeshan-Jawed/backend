package uni.project.ecommerce.Controller;

import org.springframework.web.bind.annotation.*;
import uni.project.ecommerce.DTO.CategoryDTO;
import uni.project.ecommerce.DTO.OrderDTO;
import uni.project.ecommerce.Model.Category;
import uni.project.ecommerce.Model.Order;
import uni.project.ecommerce.Service.OrderService;

import java.util.Set;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RequestMapping(value = "/api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(value = "/")
    public String saveOrder(@RequestBody OrderDTO orderDTO){
        return orderService.save(orderDTO);
    }
    @GetMapping(value="/")
    public Set<Order> getOrder(){
        return orderService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Order getOrderById(@PathVariable("id") Long id){
        return orderService.findById(id);
    }

    @PutMapping("/{id}")
    public String updateOrder(@PathVariable("id") Long id , @RequestBody OrderDTO orderDTO){
        return orderService.update(id ,orderDTO);
    }
}
