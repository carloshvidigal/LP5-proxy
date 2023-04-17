package proxy;

import java.util.Arrays;
import java.util.List;

public class Product implements IProduct {

    private Integer id;
    private String name;
    private String size;
    private Float purchaseValue;
    private Float saleValue;

    public Product(Integer id) {
        this.id = id;
        Product object = DB.getProduct(id);
        this.name = object.name;
        this.size = object.size;
        this.purchaseValue = object.purchaseValue;
        this.saleValue = object.saleValue;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> getProperties(){
        return Arrays.asList(this.name, this.size);
    }

    @Override
    public List<Float> getValues(Employee employee) {
        return Arrays.asList(this.purchaseValue, this.saleValue);
    }


}
