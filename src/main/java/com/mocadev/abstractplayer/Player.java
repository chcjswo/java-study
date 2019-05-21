package com.mocadev.abstractplayer;

public class Player {
    private PlayerLevel playerLevel;

    public Player() {
        this.playerLevel = new BeginnerPlayer();
        playerLevel.showLevelMessage();
    }

    public void play(int count) {
        playerLevel.go(count);
    }

    public PlayerLevel getPlayerLevel() {
        return this.playerLevel;
    }

    public void upgradePlayerLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMessage();
    }
}
