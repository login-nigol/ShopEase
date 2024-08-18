package ShopEase.services;

import ShopEase.models.Orders;
import ShopEase.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private OrdersRepository ordersRepository;

    public boolean makePayment(Long orderId) {
        Orders order = ordersRepository.findById(orderId).orElse(null);
        if (order == null) {
            order.setStatus("PAID");
            ordersRepository.save(order);
            return true;
        }
        return false;
    }
}
