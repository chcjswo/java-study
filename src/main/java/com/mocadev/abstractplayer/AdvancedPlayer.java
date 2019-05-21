package com.mocadev.abstractplayer;

public class AdvancedPlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("중수가 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("중수가 점프를 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("중수는 턴을 하지 못 합니다. @@@@@@@@@@@@@@@@@");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중수가 입장 했습니다 ###########");
    }
}
