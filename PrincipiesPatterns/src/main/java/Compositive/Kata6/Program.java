package src.main.java.Compositive.Kata6;
import java.util.ArrayList;
import java.util.List;

public class Program implements CourseComponent {
    private String name;
    private List<CourseComponent> components = new ArrayList<>();

    public Program(String name) {
        this.name = name;
    }

    public void addComponent(CourseComponent component) {
        components.add(component);
    }

    @Override
    public int getDuration() {
        int total = 0;
        for (CourseComponent component : components) {
            total += component.getDuration();
        }
        return total;
    }

    @Override
    public void showDetails() {
        for (CourseComponent component : components) {
            component.showDetails();
        }
        System.out.println("Programa: " + name + ", Duración Total: " + getDuration() + " horas");
    }
}
