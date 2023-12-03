package Act1;

import java.util.Objects;

public class Estudiante extends Persona{
    String especialidad;
    Procedencia procedencia;

    public Estudiante(String nombres, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombres, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante that = (Estudiante) obj;
        return Objects.equals(nombres, that.nombres) &&
               Objects.equals(procedencia, that.procedencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombres, procedencia);
    }
}
