package net.trickycreations.trickytpa.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.trickycreations.trickytpa.TrickyTPA;
import net.trickycreations.trickytpa.utilities.strings.CC;
import org.bukkit.entity.Player;

@AllArgsConstructor
@Getter
public enum Messages {
    PLAYER_NOT_FOUND("player_not_found"),
    ENTER_PLAYER("enter_player"),
    USAGE_TPAHERE("usage_tpahere"),
    USAGE_TPA("usage_tpa"),
    CANT_TPA_YOURSELF("cant_tpa_yourself"),
    NO_REQUESTS("no_requests"),
    REQUEST_SENT("request_sent"),
    REQUEST_RECEIVED("request_received"),
    RECEIVER_ACCEPT("receiver_accept"),
    SENDER_NOTIFY_ACCEPT("sender_notify_accept"),
    RECEIVER_REFUSE("receiver_refuse"),
    SENDER_NOTIFY_REFUSE("sender_notify_refuse"),
    TELEPORT_CANCELLED("teleport.messages.cancelled"),
    TELEPORT_SUCCESS("teleport.messages.success"),
    TELEPORT_PROGRESS("teleport.messages.progress"),
    TELEPORT_ACTION_BAR_PROGRESS("teleport.action_bar.progress"),
    TELEPORT_ACTION_BAR_CANCEL("teleport.action_bar.cancel"),
    TELEPORT_ACTION_BAR_SUCCESS("teleport.action_bar.success"),
    TELEPORT_TITLE_PROGRESS_TITLE("teleport.title.progress_title"),
    TELEPORT_TITLE_PROGRESS_SUB_TITLE("teleport.title.progress_sub_title"),
    TELEPORT_TITLE_CANCELLED_TITLE("teleport.title.cancelled_title"),
    TELEPORT_TITLE_CANCELLED_SUB_TITLE("teleport.title.cancelled_sub_title"),
    TELEPORT_TITLE_SUCCESS_TITLE("teleport.title.success_title"),
    TELEPORT_TITLE_SUCCESS_SUB_TITLE("teleport.title.success_sub_title");

    private final String path;

    public void send(Player player, Object... params) {
        CC.send(player, TrickyTPA.getInstance().getConfig().getString("messages." + path), params);
    }

    public void sendActionBar(Player player, Object... params) {
        CC.sendActionBar(player, TrickyTPA.getInstance().getConfig().getString("messages." + path), params);
    }

    public String get() {
        return TrickyTPA.getInstance().getConfig().getString("messages." + path);
    }
}