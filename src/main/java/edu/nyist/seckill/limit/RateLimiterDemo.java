package edu.nyist.seckill.limit;

import com.google.common.util.concurrent.RateLimiter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author rogers
 */
public class RateLimiterDemo {
    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(2);
        List<Runnable> tasks = new ArrayList<>();
        for(int i = 0;i < 10; i++){
            tasks.add(new UserRequest(i));
        }
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for (Runnable runnable : tasks){
            System.out.println("等待时间：" + rateLimiter.acquire());
            threadPool.execute(runnable);
        }
    }

    private static class UserRequest implements Runnable {
        private int id;

        public UserRequest(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(id);
        }
    }
}
