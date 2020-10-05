package uni.project.ecommerce.Service.JPA;

import org.springframework.stereotype.Service;
import uni.project.ecommerce.DTO.OrderDTO;
import uni.project.ecommerce.Model.AppUser;
import uni.project.ecommerce.Model.Order;
import uni.project.ecommerce.Repository.OrderRepository;
import uni.project.ecommerce.Service.OrderService;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class OrderJpaService implements OrderService {
    private final OrderRepository orderRepository;

    public OrderJpaService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Set<Order> findAll() {
        Set<Order> orders=new HashSet<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }

    @Override
    public Order findById(Long aLong) {
        return orderRepository.findById(aLong).orElse(null);
    }

    @Override
    public String save(OrderDTO object) {
        Order order=new Order();
        order.setDate(new Date());
        order.setAppUser(object.getAppUser());
        order.setTotal_amount(object.getTotal_amount());
        orderRepository.save(order);
        return order.toString();
    }

    @Override
    public String update(Long aLong, OrderDTO object) {
        Order order=orderRepository.findById(aLong).orElse(null);
        order.setDate(new Date());
        order.setTotal_item(object.getTotal_item());
        order.setTotal_amount(object.getTotal_amount());
        orderRepository.save(order);
        return "Record Updated Successfully";
    }

    @Override
    public void delete(Order object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
