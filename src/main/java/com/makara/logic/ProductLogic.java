package com.makara.logic;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.makara.model.Product;

public class ProductLogic {

    public static List<Product> getProducts() {
        List<Product> proList = new ArrayList<>();
        ApplicationContext context = new AnnotationConfigApplicationContext(Product.class);
        Product coke = context.getBean(Product.class);
        coke.setId(1);
        coke.setName("Coke");
        coke.setPrice(0.99);
        coke.setImage("images/products/coke.jfif");
        coke.setType(ProductType.DRINK);

        Product vital = new Product(2, "Vital", 0.25, "images/products/vital.png", ProductType.DRINK);
        Product cambodiaBeer = new Product(3, "Cambodia Beer", 0.60, "images/products/cambodia_beer.png",
                ProductType.DRINK);
        Product string = new Product(4, "String", 0.50, "images/products/string.webp", ProductType.DRINK);
        Product tomato = new Product(5, "Tomato", 0.49, "images/products/tomato.jfif", ProductType.VEGETABLE);
        Product carrot = new Product(6, "Carrot", 0.49, "images/products/carrot.png", ProductType.VEGETABLE);

        proList.add(coke);
        proList.add(vital);
        proList.add(cambodiaBeer);
        proList.add(string);
        proList.add(tomato);
        proList.add(carrot);
        return proList;
    }

    public static List<Product> getProductsByType(ProductType type) {
        List<Product> proListAll = getProducts();
        List<Product> proListByType = new ArrayList<>();

        for (Product product : proListAll) {
            if (product.type == type) {
                proListByType.add(product);
            }
        }
        return proListByType;
    }

    public static HashMap<Enum, Integer> mapProductCount(List<Product> drinks, List<Product> vegetables,
            List<Product> other) {
        HashMap<Enum, Integer> map = new HashMap<>();
        map.put(ProductType.VEGETABLE, vegetables.size());
        map.put(ProductType.DRINK, drinks.size());
        map.put(ProductType.OTHER, other.size());
        return map;
    }
}
