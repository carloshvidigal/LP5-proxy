package proxy;

import java.util.List;

public interface IProduct {
    List<String> getProperties();
    List<Float> getValues(Employee employee);
}
