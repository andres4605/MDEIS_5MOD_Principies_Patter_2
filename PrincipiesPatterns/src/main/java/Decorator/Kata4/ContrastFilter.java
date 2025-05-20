package src.main.java.Decorator.Kata4;

public class ContrastFilter extends ImageFilterDecorator {

    public ContrastFilter(Image image) {
        super(image);
    }

    @Override
    public void applyFilters() {
        super.applyFilters();
        System.out.println("Aplicando filtro de contraste");
    }
}
