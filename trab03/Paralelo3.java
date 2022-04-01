package trab03;


import java.util.*;

import static java.lang.Thread.currentThread;

public class Paralelo3 {
    static class ThreadPool {
        Queue<Runnable> tasks = new LinkedList<>();

        public ThreadPool() {
            Thread mainWorker = new Thread(() -> {
                while (true) {
                    Runnable newTaskToBeExecuted = tasks.poll();
                    if (newTaskToBeExecuted != null) newTaskToBeExecuted.run();
                }
            }, "Main Worker");
            mainWorker.start();
        }

        public void execute(Runnable newTask) {
            tasks.add(newTask);
        }
    }

    public static void main(String[] args) {
    	Contador3 c01 = new Contador3("Juan");
    	Contador3 c02 = new Contador3("Carlos");
        Runnable firstTask = new Thread(c01);
        Runnable secondTask = new Thread(c02);

        ThreadPool mySingleThreadPool = new ThreadPool();
        mySingleThreadPool.execute(firstTask);
        mySingleThreadPool.execute(secondTask);
    }
}
