class MyThread extends Thread {
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println(getName()+" running");
    }
}
public class ThreadDemo {
    public static void main(String[] a){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}
