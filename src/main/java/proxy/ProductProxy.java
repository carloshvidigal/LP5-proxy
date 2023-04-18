package proxy;

import java.util.List;

public class ProductProxy implements IProduct{

    private Product product;
    private Integer id;

    public ProductProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> getProperties() {
        if (this.product == null) {
            this.product = new Product(this.id);
        }
        return this.product.getProperties();
    }

    @Override
    public List<Float> getValues(Employee employee) {
        if(!employee.isManager()) {
            throw new IllegalArgumentException("Unauthorized employee!");
        }
        if (this.product == null) {
            this.product = new Product(this.id);
        }
        return this.product.getValues(employee);
    }
}
