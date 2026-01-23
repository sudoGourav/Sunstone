package ADBMS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Represents one query
class QueryTask implements Runnable {

    private int queryId;

    public QueryTask(int queryId) {
        this.queryId = queryId;
    }

    @Override
    public void run() {
        System.out.println(
            "Query " + queryId + " started by " + Thread.currentThread().getName()
        );

        try {
            // Simulating query execution
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
            "Query " + queryId + " finished by " + Thread.currentThread().getName()
        );
    }
}

public class InterQueryParallelism {

    public static void main(String[] args) {

        // Thread pool = multiple processors
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submitting multiple independent queries
        for (int i = 1; i <= 6; i++) {
            executor.submit(new QueryTask(i));
        }

        executor.shutdown();
    }
}
