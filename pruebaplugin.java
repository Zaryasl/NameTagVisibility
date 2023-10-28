package pruebaplugin;

import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Team;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.Location;
import java.util.List;

public class pruebaplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Team team = player.getScoreboard().getTeam(player.getName());

        if (team == null) {
            team = player.getScoreboard().registerNewTeam(player.getName());
        }

        team.setOption(Team.Option.NAME_TAG_VISIBILITY, Team.OptionStatus.NEVER);
    }

    public List<String> tabComplete(CommandSender sender, String alias, String[] args, Location location) throws IllegalArgumentException {
        if (sender == null || alias == null || args == null) {
            throw new IllegalArgumentException("Argumentos no pueden ser nulos");
        }
        // Resto del código
        return null; // Cambia esto según sea necesario
    }
}


            }
        }

class Notnull implements CommandExecutor { public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (sender instanceof Player) {
        Player player = (Player) sender;
        if (args.length == 1) {
            String option = args[0].toLowerCase();
            Team team = player.getScoreboard().getTeam(player.getName());
            if (team != null) {
                if (option.equals("show")) {
                    team.setOption(Team.Option.NAME_TAG_VISIBILITY, Team.OptionStatus.ALWAYS);
                    player.sendMessage("La visibilidad del nombre ahora está configurada para mostrar siempre.");
                } else if (option.equals("hide")) {
                    team.setOption(Team.Option.NAME_TAG_VISIBILITY, Team.OptionStatus.NEVER);
                    player.sendMessage("La visibilidad del nombre ahora está configurada para ocultarse siempre.");
                } else {
                    player.sendMessage("Opción no válida. Use 'show' o 'hide' como argumento.");
                }
            } else {
                player.sendMessage("No se encontró el equipo del jugador. Asegúrate de que el jugador tenga un equipo asignado.");
            }
        } else {
            player.sendMessage("Uso: /miComando <show|hide>");
        }
    } else {
        sender.sendMessage("Este comando solo puede ser ejecutado por un jugador.");
    }
    return true;
}
}

