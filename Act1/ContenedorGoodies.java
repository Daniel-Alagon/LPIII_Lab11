package Act1;

import java.util.List;

public class ContenedorGoodies implements Contenedora<Goodies>{
    List<Goodies> goodies;

    @Override
    public boolean existe(Goodies goodie) {
        return goodies.stream().anyMatch(g -> g.getId() == goodie.getId());
    }
}
