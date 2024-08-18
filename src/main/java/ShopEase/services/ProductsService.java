package ShopEase.services;

import ShopEase.models.Products;
import ShopEase.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProducts() { // проверка на наличие?
        return productsRepository.findAll();
    }

    public Products getProductById(Long id) {
        return productsRepository.findById(id).orElse(null);
    }

    public Products createProduct(Products product) {
        return productsRepository.save(product);
    }

    public Products updateProduct(Long id, Products product) {
        Products existingProduct = productsRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            return productsRepository.save(existingProduct);
        }
        return null;
    }
}
