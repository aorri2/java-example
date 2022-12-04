package org.example;

public class Main {
    public static void main(String[] args) {
        doTest(10);
    }

    public static void doTest(int times) {
        long startTime;
        for (int time = 0 ; time < times; time++) {
            startTime = System.nanoTime();
            testFun();
            System.out.printf("%d: %d ns\n", time+1, System.nanoTime() - startTime);
        }
    }

    public static void testFun() {
        long nothing;
        for (int i=0; i<1000000; i++) {
            nothing = (long) i *i;
        }
    }
}