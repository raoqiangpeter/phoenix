package com.raoqiang.phoenix;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class TimeoutTest {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        String result = timeoutMethod(5000);
        System.out.println("方法实际耗时：" + (System.currentTimeMillis() - start) + "毫秒");
        System.out.println("结果：" + result);

        try {
            Thread.sleep(8000);
            long start1 = System.currentTimeMillis();
            String result1 = timeoutMethod(5000);
            System.out.println("方法实际耗时：" + (System.currentTimeMillis() - start1) + "毫秒");
            System.out.println("结果：" + result1);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /**
     * 有超时时间的方法
     * @param timeout
     * @return
     */
    private static String timeoutMethod(int timeout) {
        String result = "默认";
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return unknowMethod();
            }
        });

        executorService.execute(futureTask);
        try {
            result = futureTask.get(timeout, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            //e.printStackTrace();
            futureTask.cancel(true);
            result = "默认";
        }

        return result;
    }

    /**
     * 这个方法的耗时不确定
     * @return
     */
    private static String unknowMethod() {
        Random random = new Random();
        int time = (random.nextInt(10) + 10) * 1000;
        System.out.println("任务将耗时： " + time + "毫秒");
        try {
            Thread.sleep(time);
            System.out.println("休眠将耗时： " + time + "毫秒");
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "获得方法执行后的返回值";
    }

}
