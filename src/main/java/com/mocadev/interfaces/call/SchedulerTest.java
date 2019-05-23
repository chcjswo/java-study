package com.mocadev.interfaces.call;

public class SchedulerTest {
    public static void main(String[] args) {
        Scheduler r = new RoundRobin();
        r.getNextCall();
        r.sendCallToAgent();

        r = new LeastJob();
        r.getNextCall();
        r.sendCallToAgent();

        r = new PriorityAllocation();
        r.getNextCall();
        r.sendCallToAgent();
    }
}
