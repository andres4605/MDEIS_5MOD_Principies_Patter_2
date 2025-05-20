package src.main.java.Compositive.Kata4;
//leaf

public class Product implements ProductComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        System.out.println("Producto: " + name + ", Precio: " + price);
    }
}
