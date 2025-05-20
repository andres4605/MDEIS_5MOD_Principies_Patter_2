package src.main.java.Decorator.Kata4;

public class BlackAndWhiteFilter extends ImageFilterDecorator {
protected Image image;
    public BlackAndWhiteFilter(Image image) {
        super(image);
    }

    @Override
    public void applyFilters() {
        super.applyFilters();
        System.out.println("Aplicando filtro blanco y negro");
    }
}
