package src.main.java.Decorator.Kata4;

public class BrightnessFilter extends ImageFilterDecorator {

    public BrightnessFilter(Image image) {
        super(image);
    }

    @Override
    public void applyFilters() {
        super.applyFilters();
        System.out.println("Aplicando filtro de brillo");
    }
}
