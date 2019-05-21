package com.mocadev.abstractplayer;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedPlayer advancedPlayer = new AdvancedPlayer();
        player.upgradePlayerLevel(advancedPlayer);
        advancedPlayer.go(2);

        ExpertPlayer expertPlayer = new ExpertPlayer();
        player.upgradePlayerLevel(expertPlayer);
        expertPlayer.go(10);
    }
}
