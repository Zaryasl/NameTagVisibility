package pruebaplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Team;
import org.bukkit.command.Command;

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

    public static void main(String[] args) {
        // No necesitas implementar nada aquí para un complemento de Spigot.
        // Este método es solo para aplicaciones Java independientes.
        class pruebaplugin {

            void addPlayer(@NotNull Player player) {
                // Código para añadir un jugador



            }
        }

