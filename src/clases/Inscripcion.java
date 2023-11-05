package clases;

public class Inscripcion {
    private Materia materia;
    private boolean aprobada;

    public Inscripcion(Materia materia) {
        this.materia = materia;
        this.aprobada = false;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public Materia getMateria() {
        return materia;
    }
}
