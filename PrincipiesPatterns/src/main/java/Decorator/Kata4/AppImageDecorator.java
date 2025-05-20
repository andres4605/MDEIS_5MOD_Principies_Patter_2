package src.main.java.Decorator.Kata4;

public class AppImageDecorator {
    public static void main(String[] args) {
        Image image = new BasicImage();
        
        Image filteredImage = new ContrastFilter(
        new BrightnessFilter(new BlackAndWhiteFilter(image)));

        filteredImage.applyFilters();
    }
}
