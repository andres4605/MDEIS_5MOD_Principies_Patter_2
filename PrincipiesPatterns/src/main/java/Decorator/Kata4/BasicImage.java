package src.main.java.Decorator.Kata4;

public class BasicImage implements Image {

    @Override
    public void applyFilters() {
        System.out.println("Imagen base sin filtros");
    }
}
