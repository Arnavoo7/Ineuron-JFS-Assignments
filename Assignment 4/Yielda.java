
class MyThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getPriority());
        for(int i=0; i<5; i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}


public class Yielda
{
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println(Thread.currentThread().getPriority());
        for(int i=0; i<5; i++)
        {
            System.out.println("Main Thread");        
        }
    }    
}

