package src.main.java.Compositive.Kata6;
public class Course implements CourseComponent {
    private String name;
    private int duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void showDetails() {
        System.out.println("Curso: " + name + ", Duración: " + duration + " horas");
    }
}
