package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class ProductProxyTest {

    @BeforeEach
    void setUp() {
        DB.addProduct(new Product(1, "Óleo de motor diesel", "1500ml", 80.0f, 140.0f));
        DB.addProduct(new Product(2, "Aditivo líquido limpa-parabrisa", "100ml", 7.55f, 21.01f));
    }

    @Test
    void shouldGetProperties() {
        ProductProxy product = new ProductProxy(1);

        assertEquals(Arrays.asList("Óleo de motor diesel", "1500ml"), product.getProperties());
    }

    @Test
    void shouldGetValues() {
        Employee employee = new Employee("Josh", true);
        ProductProxy product = new ProductProxy(2);

        assertEquals(Arrays.asList(7.55f, 21.01f), product.getValues(employee));
    }

    @Test
    void shouldGetExceptionUnauthorizedEmployee() {
        try {
            Employee employee = new Employee("Lillie", false);
            ProductProxy product = new ProductProxy(2);

            product.getValues(employee);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Unauthorized employee!", e.getMessage());
        }
    }
}
