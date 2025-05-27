import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> "Result from Task 1";
        Callable<String> task2 = () -> "Result from Task 2";
        Callable<String> task3 = () -> "Result from Task 3";

        Future<String> f1 = executor.submit(task1);
        Future<String> f2 = executor.submit(task2);
        Future<String> f3 = executor.submit(task3);

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executor.shutdown();
    }
}