package pruebaplugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.String.*;
import org.bukkit.scoreboard.Team;
import package.to.OptionStatus;

@Target(ElementType.TYPE_USE)
@interface MiAnotacion {
    // Puedes definir los elementos de la anotación aquí si es necesario
}
class pruebaplugin {

    void setOption(Team.OptionStatus parametro1, Team.OptionStatus parametro2) {
        // cuerpo del método
    }
}

