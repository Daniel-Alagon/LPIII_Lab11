package Act1;

import java.util.List;

public class ContenedorEstudiante implements Contenedora<Estudiante>{
    List<Estudiante> estudiantes;

    @Override
    public boolean existe(Estudiante estudiante) {
        return estudiantes.stream().anyMatch(e -> e.getNombres().equals(estudiante.getNombres()) && e.getProcedencia().equals(estudiante.getProcedencia()));
    }
}
