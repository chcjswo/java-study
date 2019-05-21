package com.mocadev.abstractplayer;

public class BeginnerPlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("초보자가 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("초보자는 점프를 하지 못 합니다. @@@@@@@@@@@@@@@@@");
    }

    @Override
    public void turn() {
        System.out.println("초보자는 턴을 하지 못 합니다. @@@@@@@@@@@@@@@@@");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보자가 입장 했습니다 ###########");
    }
}
