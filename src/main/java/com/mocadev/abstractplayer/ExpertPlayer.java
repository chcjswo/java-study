package com.mocadev.abstractplayer;

public class ExpertPlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("초고수가 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("초고수가 점프를 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("초고수가 턴을 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초고수가 입장 했습니다 ###########");
    }
}
