package com.mocadev.interfaces.call;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(n -> System.out.println(n));
    }
}
