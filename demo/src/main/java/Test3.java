import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Future submit = es.submit(new MyTask());
        System.out.println("123");
        try {
            System.out.println(submit.get());
        } catch (Exception e) {

        }
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        map.put()
        System.out.println("456");
    }
}
    class MyTask implements Callable {
        @Override
        public Object call() {
            System.out.println("子线程中。。");
            return "完毕";
        }
    }
