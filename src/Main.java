import clases.Materia;
import clases.Alumno;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear las materias
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", null);
        Materia paradigmas = new Materia("Paradigmas de Programación", List.of(algoritmos));
        Materia diseno = new Materia("Diseño de Sistemas", List.of(paradigmas));

        // Crear un alumno
        Alumno alumno = new Alumno();

        // Inscribir materias
        alumno.inscribirMateria(algoritmos);
        alumno.inscribirMateria(paradigmas);
        alumno.inscribirMateria(diseno);

        // Validar inscripciones
        boolean inscripcionesValidas = alumno.validarInscripciones();
        System.out.println("Las inscripciones son válidas: " + inscripcionesValidas);
    }
}