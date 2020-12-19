package ru.hw.num4;

public class ABCThreads {

    static Object way = new Object();
    static volatile int currentNumber = 1;
    static final int max = 5;
    public static void main(String[] args) {

        new Thread(()->{
            try {
                for (int i = 0; i < max; i++) {
                    synchronized (way){
                        while (currentNumber !=1){
                            way.wait();
                        }
                        System.out.print("A");
                        currentNumber = 2;
                        way.notifyAll();
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                for (int i = 0; i < max; i++) {
                    synchronized (way){
                        while (currentNumber !=2){
                            way.wait();
                        }
                        System.out.print("B");
                        currentNumber = 3;
                        way.notifyAll();
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                for (int i = 0; i < max; i++) {
                    synchronized (way){
                        while (currentNumber !=3){
                            way.wait();
                        }
                        System.out.print("C");
                        currentNumber = 1;
                        way.notifyAll();
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();
    }
}

//Я пологаю что в данном виде чата ExecutorService может быть актуален при очень большом количестве пользователей
//общающихся одновременно в одном (групповом) интерфейсе. Не считаю необходимым на данном этапе вкидывать эту функцию.
//а вообще может пригодиться при большом онлайне и большой нагрузке.