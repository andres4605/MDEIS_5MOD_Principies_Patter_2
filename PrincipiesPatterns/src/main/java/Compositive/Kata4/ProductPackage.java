package src.main.java.Compositive.Kata4;
import java.util.ArrayList;
import java.util.List;

//composite
public class ProductPackage implements ProductComponent {
    private String name;
    private List<ProductComponent> components = new ArrayList<>();

    public ProductPackage(String name) {
        this.name = name;
    }

    public void addComponent(ProductComponent component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void showDetails() {
        for (ProductComponent component : components) {
        component.showDetails();  // Muestra detalles individuales primero
        }
        System.out.println("Paquete: " + name + ", Precio Total: $" + getPrice());  // Luego muestra el paquete
        
    }
}
