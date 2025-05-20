package src.main.java.Compositive.Kata6;
public class AppCourse {
    public static void main(String[] args) {
        // Cursos individuales
        CourseComponent matematicas = new Course("Matemáticas", 40);
        CourseComponent fisica = new Course("Física", 30);
        // Programa: Ciencias Básicas
        Program cienciasBasicas = new Program("Ciencias Básicas");
        cienciasBasicas.addComponent(matematicas);
        cienciasBasicas.addComponent(fisica);

        // Mostrar detalles
        cienciasBasicas.showDetails();
    }
}
