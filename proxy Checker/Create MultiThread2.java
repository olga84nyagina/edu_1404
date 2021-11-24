public class MultiThread {
    public static void main(String[] args) {
        Thread task1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Мыть посуду завершено на "+i+"%");
                }
            }
        });
        Thread task2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Пылесосить посуду завершено на "+i+"%");
                }
            }
        });
        Thread task3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Стирка посуду завершено на "+i+"%");
                }
            }
        });
   
        Thread task1 = new Thread(new MyRunnableClass("Мыть посуду"));
        Thread task2 = new Thread(new MyRunnableClass("Пылесосить"));
        Thread task3 = new Thread(new MyRunnableClass("Стирка"));
        task1.start();
        task2.start();
        task3.start();
    }
}

class MyRunnableClass implements Runnable{
    String taskName;

    public MyRunnableClass(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(taskName+" завершено на "+i+"%");
        }
    }
}

class MyThread extends Thread{
    String taskName;

    public MyThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println(taskName+" завершено на "+i+"%");
        }
    }
}
