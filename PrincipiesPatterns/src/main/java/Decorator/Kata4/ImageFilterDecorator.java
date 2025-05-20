package src.main.java.Decorator.Kata4;

public abstract class ImageFilterDecorator implements Image {
    protected Image image;

    public ImageFilterDecorator(Image image) {
        this.image = image;
    }

    @Override
    public void applyFilters() {
        image.applyFilters();
    }
}
