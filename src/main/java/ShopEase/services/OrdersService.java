package ShopEase.services;

import ShopEase.models.Orders;
import ShopEase.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public Orders createOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    public Orders getOrderById(Long id) {
        return ordersRepository.findById(id).orElse(null);
    }

    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Orders updateOrderById(Long id, Orders orders) {
        Orders existingOrder = ordersRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            existingOrder.setStatus(orders.getStatus());
            return ordersRepository.save(existingOrder);
        }
        return null;
    }
}
