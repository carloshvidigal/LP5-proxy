package proxy;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private static Map<Integer,Product> products = new HashMap<>();

    public static Product getProduct(Integer id) {
        return products.get(id);
    }

    public static void addProduct(Product product) {
        products.put(product.getId(), product);
    }
}
