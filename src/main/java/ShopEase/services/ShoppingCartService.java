package ShopEase.services;

import lombok.Data;
import ShopEase.models.ShoppingCart;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.stereotype.Service;
import ShopEase.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart addItemToCart(ShoppingCart cart) {
        return shoppingCartRepository.save(cart);
    }

    private ShoppingCart getShoppingCart(Long userId) {
        return shoppingCartRepository.findById(userId).orElse(null);
    }
}
