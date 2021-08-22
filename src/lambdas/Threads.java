package lambdas;

public class Threads {
    public static void main(String[] args) {

        // multi threads
        Runnable t1 = new Trabalho1();
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <  100; i++) {
                    System.out.println(i  + " tarefa 2");
                }
            }
        };
        Runnable t3 = Threads::trabalho3;

        // Thread = processo paralelo CPU
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);

        tt1.start();
        tt2.start();
        tt3.start();
    }

    static void trabalho3 () {
        for (int i = 0; i <  100; i++) {
            System.out.println(i  + " tarefa 3");
        }
    }
}
