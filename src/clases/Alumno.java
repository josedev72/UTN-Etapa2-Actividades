package clases;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Inscripcion> inscripciones;

    public Alumno() {
        inscripciones = new ArrayList<>();
    }

    public void inscribirMateria(Materia materia) {
        Inscripcion inscripcion = new Inscripcion(materia);
        inscripciones.add(inscripcion);
    }

    public boolean validarInscripciones() {
        for (Inscripcion inscripcion : inscripciones) {
            Materia materia = inscripcion.getMateria();
            if (materia.getCorrelativas() != null) {
                for (Materia correlativa : materia.getCorrelativas()) {
                    if (!tieneInscripcion(correlativa)) {
                        return false;
                    }
                }
            }
            inscripcion.setAprobada(true);
        }
        return true;
    }

    private boolean tieneInscripcion(Materia materia) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getMateria().equals(materia)) {
                return true;
            }
        }
        return false;
    }
}
