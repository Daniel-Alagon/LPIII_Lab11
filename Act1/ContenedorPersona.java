package Act1;

import java.util.List;

public class ContenedorPersona implements Contenedora<Persona>{
    List<Persona> personas;

    @Override
    public boolean existe(Persona persona) {
        return personas.stream().anyMatch(p -> p.getNombres().equals(persona.getNombres()));
    }
}
