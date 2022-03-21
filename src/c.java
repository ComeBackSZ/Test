import javax.xml.crypto.Data;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author SHI
 * @date 2022/3/16 21:13
 */
public class c {
    public static void main(String[] args) {
        int i = 0 ;
//        local.set(1);
//        local.set(2);

//        System.out.println(local.get());
//        local.get();


        Thread myThread1 = new Thread(new MyThread());
        Thread myThread2 = new Thread(new MyThread());
        myThread1.start();
        myThread2.start();


//        Date date = new Date();
//        System.out.println(date.getTime());

    }



    static class MyThread implements Runnable{

        @Override
        public void run() {
            Date date = new Date();
            System.out.println(Thread.currentThread().getName()+" "+date.getTime());

            try {
                Thread.sleep(2000);
                local.set(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" "+local.get());
        }
    }

    public static final ThreadLocal<String> local = new ThreadLocal<>();
}
