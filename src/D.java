/**
 * @author SHI
 * @date 2022/3/19 11:19
 */
public class D {
    class mythread implements Runnable {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private static int index = 0 ;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                if (index % 3 == 0) {
                    System.out.println("a"+i);
                    index++ ;
                }else {
                    i-- ;
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                if (index % 3 == 1) {
                    System.out.println("b"+i);
                    index++ ;
                }else {
                    i-- ;
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                if (index % 3 == 2) {
                    System.out.println("c"+i);
                    index++ ;
                }else {
                    i-- ;
                }
            }
        });
//        for (int i = 0; i < 10; i++) {
            thread1.start();
            thread2.start();
            thread3.start();
//        }

    }
}
