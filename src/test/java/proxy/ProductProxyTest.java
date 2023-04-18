package proxy;

import org.junit.jupiter.api.BeforeEach;

public class ProductProxyTest {

    @BeforeEach
    void setUp() {
        DB.addProduct(new Product(1, "Óleo de motor diesel", "1500ml", 80.0f, 140.0f));
    }
}
