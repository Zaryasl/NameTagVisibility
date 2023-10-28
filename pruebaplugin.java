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

